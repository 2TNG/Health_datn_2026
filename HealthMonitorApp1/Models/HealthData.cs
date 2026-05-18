using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace HealthDataAPI2.Models
{
    // Bảng Users
    [Table("Users")]
    public class User
    {
        [Key]
        public int UserId { get; set; }

        [Required]
        [MaxLength(50)]
        public string Username { get; set; } = string.Empty;

        [Required]
        [MaxLength(255)]
        public string UserPassword { get; set; } = string.Empty;
    }

    // Bảng HealthReadings
    [Table("HealthReadings")]
    public class HealthData
    {
        [Key]
        public int Id { get; set; }

        [Required]
        public int UserId { get; set; }

        [Required]
        public float Temperature { get; set; }

        [Required]
        public int HeartRate { get; set; }

        [Required]
        public int SpO2 { get; set; }

        [Required]
        public DateTime Timestamp { get; set; }

        // Navigation property
        [ForeignKey("UserId")]
        public virtual User? User { get; set; }
    }

    // DTO nhận dữ liệu từ ESP32 (có UserId)
    public class HealthDataDto
    {
        public float temperature { get; set; }
        public int hr { get; set; }
        public int spo2 { get; set; }
        public string time { get; set; } = string.Empty;
        public int userId { get; set; }  // ⭐ Thêm UserId
    }

    // DTO cho login
    public class LoginDto
    {
        public string username { get; set; } = string.Empty;
        public string password { get; set; } = string.Empty;
    }

    // DTO response login
    public class LoginResponseDto
    {
        public bool success { get; set; }
        public int userId { get; set; }
        public string username { get; set; } = string.Empty;
        public string message { get; set; } = string.Empty;
    }
}