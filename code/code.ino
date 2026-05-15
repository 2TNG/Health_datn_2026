#include <Wire.h>
#include <Adafruit_MLX90614.h>
#include <Adafruit_GFX.h>
#include <Adafruit_SSD1306.h>
#include "MAX30100_PulseOximeter.h"

#define BTN_TEMP PB0
#define BTN_HEART PB1
#define BUZZER PB10

#define SCREEN_WIDTH 128
#define SCREEN_HEIGHT 64
#define OLED_RESET -1

Adafruit_SSD1306 display(SCREEN_WIDTH, SCREEN_HEIGHT, &Wire, OLED_RESET);
Adafruit_MLX90614 mlx = Adafruit_MLX90614();
PulseOximeter pox;

uint32_t tsLastReport = 0;

// ===== STATE =====
bool btnTempLast = HIGH;
bool btnHeartLast = HIGH;

// ===== BEEP KHÔNG BLOCK =====
int beepCount = 0;
bool beepState = false;
unsigned long beepTimer = 0;

// ===== HEART =====
bool measuringHeart = false;
int validCount = 0;
bool measuringTemp = false;

void onBeatDetected() {
  Serial.println("💓 Beat!");
}

void startBeep(int times) {
  beepCount = times;  // ON + OFF
}

void beep() {
  for (int i = 0; i < 3; i++) {
    digitalWrite(BUZZER, 1);
    delay(100);
    digitalWrite(BUZZER, 0);
    delay(100);
  }
}

bool waitWifiConnected() {
  String data = "";

  while (true) {
    while (Serial.available()) {
      char c = Serial.read();

      if (c == '\n') {
        data.trim();

        Serial.println("Nhan: " + data);

        if (data.indexOf("WIFI CONNECTED") >= 0) {
          return true;
        }

        data = "";  // reset nếu không đúng
      } else {
        data += c;
      }
    }
  }
}

float tempValue = 0;
float hrValue = 0;
float spo2Value = 0;
float temp, hr, spo2;
void setup() {
  pinMode(BTN_TEMP, INPUT_PULLUP);
  pinMode(BTN_HEART, INPUT_PULLUP);
  pinMode(BUZZER, OUTPUT);

  Serial.begin(115200);
  if (waitWifiConnected()) {
    beep();
  }
  Wire.begin(PB7, PB6);  //sda,scl
  // OLED init trong setup()
  if (!display.begin(SSD1306_SWITCHCAPVCC, 0x3C)) {
    Serial.println("OLED FAIL");
    while (1)
      ;
  }
  Serial.println("OLED OK");

  // Chờ một chút để OLED sẵn sàng
  display.clearDisplay();
  display.setTextColor(WHITE);
  display.setTextSize(1);
  display.setCursor(0, 0);
  display.println("OLED INITIALIZING...");
  display.display();
  delay(1000);  // ⬅ đợi 1 giây

  // Bây giờ mới khởi tạo cảm biến
  if (!mlx.begin()) {
    Serial.println("MLX90614 FAIL");
  } else {
    Serial.println("MLX90614 OK");
  }

  // MAX30100
  if (!pox.begin()) {
    Serial.println("MAX30100 FAIL");
  } else {
    Serial.println("MAX30100 OK");
    // pox.setOnBeatDetectedCallback(onBeatDetected);
    pox.setIRLedCurrent(MAX30100_LED_CURR_7_6MA);
  }
}

void loop() {
  pox.update();  // 🔥 bắt buộc luôn chạy

  temp = mlx.readObjectTempC();
  hr = pox.getHeartRate();
  spo2 = pox.getSpO2();

  controlButton();

  if (measuringTemp) {
    if (temp > 35) {
      measuringTemp = false;
      tempValue = temp;
      String data = "TEMP:" + String(tempValue, 1);
      Serial.println(data);
      if (tempValue < 35.5 || tempValue > 38.5) {
        startBeep(3);
      }
    }
  }

  if (measuringHeart) {
    hrValue = hr;
    spo2Value = spo2;

    if (hr > 40 && hr < 100 && spo2 > 80 && spo2 <= 100) {
      validCount++;
    } else {
      validCount = 0;
    }

    if (validCount >= 5) {
      measuringHeart = false;
      String data = "HR:" + String((int)hrValue) + ",SPO2:" + String((int)spo2Value);
      Serial.println(data);
      if (hrValue < 60 || hrValue > 100 || spo2Value < 93) {
        startBeep(3);
      }
    }
  }


  control_CMD_beep();
  DisPlay();
}

void DisPlay() {
  // ===== OLED =====
  display.clearDisplay();

  display.setTextSize(1);
  display.setCursor(0, 0);
  display.println("SMART HEALTH");

  display.setTextSize(2);
  display.setCursor(0, 15);
  display.print(tempValue, 1);
  display.print("C");

  display.setTextSize(1);
  display.setCursor(0, 40);

  display.print("HR: ");
  display.print((int)hrValue);

  display.setCursor(0, 55);
  display.print("SpO2: ");
  display.print((int)spo2Value);

  // ===== LOADING =====
  display.setCursor(50, 40);
  if (measuringTemp || measuringHeart) {
    display.print("Loading...");
  } else {
    display.print("done!");
  }

  display.display();
}

void control_CMD_beep() {
  // ===== BEEP KHÔNG BLOCK =====
  if (beepCount > 0 && millis() - beepTimer > 100) {
    beepTimer = millis();
    beepState = !beepState;
    digitalWrite(BUZZER, beepState);

    if (!beepState) beepCount--;
  }
}

void controlButton() {
  // ===== NÚT HEART =====
  bool btnHeart = digitalRead(BTN_HEART);
  if (btnHeart == LOW && btnHeartLast == HIGH) {
    measuringHeart = true;
    Serial.println("LOADING...");
    validCount = 0;
    startBeep(1);
  }
  btnHeartLast = btnHeart;

  // ===== NÚT TEMP (nhấn 1 lần) =====
  bool btnTemp = digitalRead(BTN_TEMP);
  if (btnTemp == LOW && btnTempLast == HIGH) {
    measuringTemp = true;
    Serial.println("LOADING...");
    startBeep(1);
  }
  btnTempLast = btnTemp;
}