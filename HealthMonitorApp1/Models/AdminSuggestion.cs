namespace HealthMonitorApp1.Models
{
    public class AdminSuggestion
    {
        public string id { get; set; } = string.Empty;
        public int userId { get; set; }
        public string username { get; set; } = string.Empty;
        public string message { get; set; } = string.Empty;
        public string createdAt { get; set; } = string.Empty;
        public string adminName { get; set; } = string.Empty;
    }

    public class UserInfo
    {
        public int UserId { get; set; }
        public string Username { get; set; } = string.Empty;
        public string Role { get; set; } = string.Empty;
        public DateTime? LastLogin { get; set; }
    }

    public class AdminStats
    {
        public int TotalUsers { get; set; }
        public int TotalReadings { get; set; }
        public int ActiveUsersToday { get; set; }
        public double AvgTemperature { get; set; }
        public double AvgHeartRate { get; set; }
        public double AvgSpO2 { get; set; }
        public DateTime LastUpdate { get; set; }
    }
}