namespace HealthMonitorApp1.Models
{
    public class User
    {
        public int UserId { get; set; }   
        public string Username { get; set; } = string.Empty;
        public string Password { get; set; } = string.Empty;
        public string Role { get; set; } = "user";
        public DateTime CreatedAt { get; set; }
        public DateTime? LastLogin { get; set; }
        public bool IsActive { get; set; } = true;

        // Helper property
        public bool IsAdmin => Role == "admin";
    }
}