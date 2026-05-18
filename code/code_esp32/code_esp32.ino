#include <Wire.h>
#include <LiquidCrystal_I2C.h>
#include <HardwareSerial.h>
#include <WiFiManager.h>
#include <WiFi.h>
#include <HTTPClient.h>
#include <time.h>

WiFiManager wifiManager;
HardwareSerial mySerial(2);

#define RXD2 25
#define TXD2 26

LiquidCrystal_I2C lcd(0x27, 16, 2);

String data = "";

const char* apiServer = "http://192.168.1.100:5000";
const char* apiEndpoint = "http://healthapitoan.runasp.net";

String getTimeString() {
  struct tm timeinfo;
  if (!getLocalTime(&timeinfo)) return "";
  char buffer[30];
  strftime(buffer, sizeof(buffer), "%Y-%m-%d %H:%M:%S", &timeinfo);
  return String(buffer);
}

bool sendToWebAPI(float temperature, int hr, int spo2, String timeString) {
  if (WiFi.status() != WL_CONNECTED) {
    return false;
  }
  
  HTTPClient http;
  String url = String(apiServer) + apiEndpoint;
  
  http.begin(url);
  http.addHeader("Content-Type", "application/json");
  
  String jsonPayload = "{";
  jsonPayload += "\"temperature\":" + String(temperature, 1) + ",";
  jsonPayload += "\"hr\":" + String(hr) + ",";
  jsonPayload += "\"spo2\":" + String(spo2) + ",";
  jsonPayload += "\"time\":\"" + timeString + "\"";
  jsonPayload += "}";
  
  int httpResponseCode = http.POST(jsonPayload);
  http.end();
  
  return httpResponseCode > 0;
}

void processAndSendData(String str) {
  if (str.indexOf("LOADING") >= 0) return;
  
  float temperature = 0;
  int hr = 0;
  int spo2 = 0;
  bool hasTemp = false;
  bool hasHR = false;
  bool hasSpO2 = false;
  
  if (str.indexOf("TEMP:") >= 0) {
    temperature = str.substring(str.indexOf("TEMP:") + 5).toFloat();
    hasTemp = true;
  }
  
  if (str.indexOf("HR:") >= 0) {
    int start = str.indexOf("HR:") + 3;
    int end = str.indexOf(",", start);
    if (end == -1) end = str.length();
    hr = str.substring(start, end).toInt();
    hasHR = true;
  }
  
  if (str.indexOf("SPO2:") >= 0) {
    spo2 = str.substring(str.indexOf("SPO2:") + 5).toInt();
    hasSpO2 = true;
  }
  
  String timeNow = getTimeString();
  if (timeNow.length() == 0) return;
  
  if (hasTemp) {
    sendToWebAPI(temperature, 0, 0, timeNow);
    delay(500);
  }
  
  if (hasHR && hasSpO2) {
    sendToWebAPI(0, hr, spo2, timeNow);
  }
}

void setup() {
  Serial.begin(115200);
  mySerial.begin(115200, SERIAL_8N1, RXD2, TXD2);
  
  lcd.init();
  lcd.backlight();
  
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
    lcd.clear();
    lcd.setCursor(0, 0);
    lcd.print("WIFI CONNECT OK!");
    delay(1000);
  }
  
  configTime(7 * 3600, 0, "pool.ntp.org");
  
  Serial.print("Syncing time");
  int retry = 0;
  struct tm timeinfo;
  while (!getLocalTime(&timeinfo) && retry < 10) {
    Serial.print(".");
    delay(1000);
    retry++;
  }
  Serial.println();
  
  lcd.clear();
  lcd.setCursor(5, 0);
  lcd.print("READY!");
  lcd.setCursor(0, 1);
  lcd.print("HTTP API Mode");
  delay(2000);
}

void loop() {
  while (mySerial.available()) {
    char c = mySerial.read();
    
    if (c == '\n') {
      Serial.println(data);
      displayData(data);
      processAndSendData(data);
      data = "";
    } else {
      data += c;
    }
  }
  delay(10);
}

void displayData(String str) {
  lcd.clear();
  
  if (str.indexOf("LOADING") >= 0) {
    lcd.setCursor(0, 0);
    lcd.print("LOADING...");
    return;
  }
  
  int row = 0;
  
  if (str.indexOf("TEMP:") >= 0) {
    float temp = str.substring(str.indexOf("TEMP:") + 5).toFloat();
    lcd.setCursor(0, row);
    lcd.print("T:");
    lcd.print(temp, 1);
    lcd.print("C");
    row++;
  }
  
  if (str.indexOf("HR:") >= 0) {
    int start = str.indexOf("HR:") + 3;
    int end = str.indexOf(",", start);
    if (end == -1) end = str.length();
    int hr = str.substring(start, end).toInt();
    
    lcd.setCursor(0, row);
    lcd.print("HR:");
    lcd.print(hr);
    row++;
  }
  
  if (str.indexOf("SPO2:") >= 0) {
    int spo2 = str.substring(str.indexOf("SPO2:") + 5).toInt();
    lcd.setCursor(0, row);
    lcd.print("O2:");
    lcd.print(spo2);
    lcd.print("%");
  }
}