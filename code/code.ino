#include <Wire.h>
#include <Adafruit_MLX90614.h>
#include "MAX30100_PulseOximeter.h"

#define BTN_TEMP PA0
#define BTN_HEART PA1
#define BUZZER PA10

#define I2C_SCL PB6
#define I2C_SDA PB7

#define UART2_TX PA2
#define UART2_RX PA3

Adafruit_MLX90614 mlx = Adafruit_MLX90614();
PulseOximeter pox;

HardwareSerial Serial2(USART2);

bool btnTempLast = HIGH;
bool btnHeartLast = HIGH;

int beepCount = 0;
bool beepState = false;
unsigned long beepTimer = 0;

bool measuringHeart = false;
int validCount = 0;
bool measuringTemp = false;

float tempValue = 0;
float hrValue = 0;
float spo2Value = 0;
float temp, hr, spo2;

void startBeep(int times) {
  beepCount = times;
}

void setup() {
  pinMode(BTN_TEMP, INPUT_PULLUP);
  pinMode(BTN_HEART, INPUT_PULLUP);
  pinMode(BUZZER, OUTPUT);

  Serial.begin(115200);   
  Serial2.begin(115200);  

  Serial.println("STM32 START");

  Wire.setSCL(I2C_SCL);
  Wire.setSDA(I2C_SDA);
  Wire.begin();

  if (!mlx.begin()) {
    Serial.println("MLX90614 FAIL");
    Serial2.println("MLX90614 FAIL");
  } else {
    Serial.println("MLX90614 OK");
    Serial2.println("MLX90614 OK");
  }

  if (!pox.begin()) {
    Serial.println("MAX30100 FAIL");
    Serial2.println("MAX30100 FAIL");
  } else {
    Serial.println("MAX30100 OK");
    Serial2.println("MAX30100 OK");
    pox.setIRLedCurrent(MAX30100_LED_CURR_7_6MA);
  }

  Serial.println("READY");
  Serial2.println("READY");
}

void loop() {
  pox.update();

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
      Serial2.println(data);
      
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
      Serial2.println(data);
      
      if (hrValue < 60 || hrValue > 100 || spo2Value < 93) {
        startBeep(3);
      }
    }
  }

  controlBeep();
}

void controlBeep() {
  if (beepCount > 0 && millis() - beepTimer > 100) {
    beepTimer = millis();
    beepState = !beepState;
    digitalWrite(BUZZER, beepState);

    if (!beepState) beepCount--;
  }
}

void controlButton() {
  bool btnHeart = digitalRead(BTN_HEART);
  if (btnHeart == LOW && btnHeartLast == HIGH) {
    measuringHeart = true;
    Serial.println("LOADING");
    Serial2.println("LOADING");
    validCount = 0;
    startBeep(1);
  }
  btnHeartLast = btnHeart;

  bool btnTemp = digitalRead(BTN_TEMP);
  if (btnTemp == LOW && btnTempLast == HIGH) {
    measuringTemp = true;
    Serial.println("LOADING");
    Serial2.println("LOADING");
    startBeep(1);
  }
  btnTempLast = btnTemp;
}