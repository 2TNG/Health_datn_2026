#include <Wire.h>
#include <LiquidCrystal_I2C.h>
#include <HardwareSerial.h>
#include <WiFiManager.h>
#include <WiFi.h>
#include <Firebase_ESP_Client.h>
#include <time.h>

WiFiManager wifiManager;
HardwareSerial mySerial(2);  // UART2

#define RXD2 25
#define TXD2 26

LiquidCrystal_I2C lcd(0x27, 16, 2);

String data = "";

// ===== FIREBASE =====
#define FIREBASE_HOST "https://baochay-8ae78-default-rtdb.firebaseio.com/"
#define FIREBASE_AUTH "GpCAUMOaGg8y7LyY7g4ogpAqOwfU20CJIBgVHbfo"

FirebaseData fbdo;
FirebaseAuth auth;
FirebaseConfig config;

// ===== TIME =====
String getTimeString() {
  struct tm timeinfo;
  if (!getLocalTime(&timeinfo)) return "0";

  char buffer[30];
  strftime(buffer, sizeof(buffer), "%Y-%m-%d %H:%M:%S", &timeinfo);
  return String(buffer);
}

void setup() {
  Serial.begin(115200);
  mySerial.begin(115200, SERIAL_8N1, RXD2, TXD2);

  lcd.init();
  lcd.backlight();

  WiFi_config();

  // ===== TIME NTP =====
  configTime(7 * 3600, 0, "pool.ntp.org");

  // ===== FIREBASE INIT =====
  config.host = FIREBASE_HOST;
  config.signer.tokens.legacy_token = FIREBASE_AUTH;
  Firebase.begin(&config, &auth);
  Firebase.reconnectWiFi(true);

  lcd.clear();
  lcd.setCursor(5, 0);
  lcd.print("READY!");
  delay(1000);
}

void loop() {
  while (mySerial.available()) {
    char c = mySerial.read();

    if (c == '\n') {
      Serial.println(data);

      displayData(data);      // giữ nguyên
      sendToFirebase(data);   // 🔥 THÊM DÒNG NÀY

      data = "";
    } else {
      data += c;
    }
  }
}

// ===== 🔥 FIREBASE FUNCTION (THÊM MỚI) =====
void sendToFirebase(String str) {

  if (str.indexOf("LOADING") >= 0) return;

  FirebaseJson json;

  bool hasData = false; // kiểm tra có data thật không

  // ===== TEMP =====
  if (str.indexOf("TEMP:") >= 0) {
    float temp = str.substring(str.indexOf("TEMP:") + 5).toFloat();
    json.set("temp", temp);
    hasData = true;
  }

  // ===== HR =====
  if (str.indexOf("HR:") >= 0) {
    int start = str.indexOf("HR:") + 3;
    int end = str.indexOf(",", start);
    if (end == -1) end = str.length();

    int hr = str.substring(start, end).toInt();
    json.set("hr", hr);
    hasData = true;
  }

  // ===== SPO2 =====
  if (str.indexOf("SPO2:") >= 0) {
    int spo2 = str.substring(str.indexOf("SPO2:") + 5).toInt();
    json.set("spo2", spo2);
    hasData = true;
  }

  // 👉 Không có data thì không gửi
  if (!hasData) return;

  // ===== TIME =====
  String timeNow = getTimeString();
  json.set("time", timeNow);

  // ===== NOW (giá trị mới nhất) =====
  Firebase.RTDB.setJSON(&fbdo, "/now", &json);

  // ===== HISTORY (log đầy đủ data + time) =====
  Firebase.RTDB.pushJSON(&fbdo, "/history", &json);
}

// ===== HIỂN THỊ (GIỮ NGUYÊN) =====
void displayData(String str) {
  lcd.clear();

  if (str.indexOf("LOADING") >= 0) {
    lcd.setCursor(0, 0);
    lcd.print("LOADING...");
    return;
  }

  if (str.indexOf("TEMP:") >= 0) {
    float temp = str.substring(str.indexOf("TEMP:") + 5).toFloat();

    lcd.setCursor(0, 0);
    lcd.print("Temp:");
    lcd.print(temp, 1);
    lcd.print("C");
  }

  if (str.indexOf("HR:") >= 0) {
    int start = str.indexOf("HR:") + 3;
    int end = str.indexOf(",", start);
    if (end == -1) end = str.length();

    int hr = str.substring(start, end).toInt();

    lcd.setCursor(0, 0);
    lcd.print("HR:");
    lcd.print(hr);
  }

  if (str.indexOf("SPO2:") >= 0) {
    int spo2 = str.substring(str.indexOf("SPO2:") + 5).toInt();

    lcd.setCursor(0, 1);
    lcd.print("SpO2:");
    lcd.print(spo2);
    lcd.print("%");
  }
}

// ===== WIFI (GIỮ NGUYÊN) =====
void WiFi_config() {
  lcd.clear();
  lcd.setCursor(0, 0);
  lcd.print("  CONNECT WIFI  ");
  lcd.setCursor(0, 1);
  lcd.print("   IOT HEALTH   ");

  wifiManager.setConfigPortalTimeout(60);
  bool res = wifiManager.autoConnect("IOT HEALTH", "");

  if (!res) {
    Serial.println("Failed to connect");
    lcd.clear();
    lcd.setCursor(0, 0);
    lcd.print("RESTART!");
    delay(1500);
    ESP.restart();
  } else {
    Serial.println("Connected");
    mySerial.println("WIFI CONNECTED");
    lcd.clear();
    lcd.setCursor(0, 0);
    lcd.print("WIFI CONNECT OK!");
    delay(1000);
  }
}