-- =====================================================
-- TẠO DATABASE MỚI (CẦN QUYỀN ADMIN)
-- =====================================================

-- Bước 1: Tạo database mới
CREATE DATABASE HealthDB;
GO

-- Bước 2: Chuyển sang database mới
USE HealthDB;
GO

-- Bước 3: Tạo bảng Users
CREATE TABLE Users (
    UserId INT IDENTITY(1,1) PRIMARY KEY,
    Username NVARCHAR(50) NOT NULL UNIQUE,
    UserPassword NVARCHAR(255) NOT NULL
);
GO

-- Bước 4: Tạo bảng HealthReadings
CREATE TABLE HealthReadings (
    Id INT IDENTITY(1,1) PRIMARY KEY,
    UserId INT NOT NULL,
    Temperature FLOAT NOT NULL,
    HeartRate INT NOT NULL,
    SpO2 INT NOT NULL,
    Timestamp DATETIME2 NOT NULL DEFAULT GETDATE(),
    
    CONSTRAINT FK_HealthReadings_User 
        FOREIGN KEY (UserId) REFERENCES Users(UserId) 
        ON DELETE CASCADE
);
GO

-- Bước 5: Tạo Index
CREATE INDEX IX_HealthReadings_UserId_Timestamp 
    ON HealthReadings(UserId, Timestamp DESC);
    
CREATE INDEX IX_Users_Username ON Users(Username);
GO

-- Bước 6: Chèn dữ liệu mẫu
INSERT INTO Users (Username, UserPassword)
VALUES 
    ('nguyen_van_a', 'password123'),
    ('tran_thi_b', 'password123'),
    ('le_van_c', 'password123');
GO

-- Bước 7: Chèn dữ liệu sức khỏe
-- User 1
INSERT INTO HealthReadings (UserId, Temperature, HeartRate, SpO2, Timestamp)
VALUES 
    (1, 36.5, 72, 98, GETDATE()),
    (1, 36.6, 74, 97, DATEADD(MINUTE, -5, GETDATE())),
    (1, 36.7, 71, 98, DATEADD(MINUTE, -10, GETDATE()));

-- User 2
INSERT INTO HealthReadings (UserId, Temperature, HeartRate, SpO2, Timestamp)
VALUES 
    (2, 37.8, 95, 97, GETDATE()),
    (2, 37.5, 92, 96, DATEADD(MINUTE, -5, GETDATE())),
    (2, 36.9, 88, 94, DATEADD(MINUTE, -10, GETDATE()));

-- User 3
INSERT INTO HealthReadings (UserId, Temperature, HeartRate, SpO2, Timestamp)
VALUES 
    (3, 36.9, 110, 96, GETDATE()),
    (3, 37.0, 108, 95, DATEADD(MINUTE, -5, GETDATE())),
    (3, 36.8, 105, 94, DATEADD(MINUTE, -10, GETDATE()));
GO

-- Bước 8: Kiểm tra
SELECT * FROM Users;
SELECT * FROM HealthReadings;
GO