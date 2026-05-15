namespace HealthMonitorApp1.Models
{
    public class User
    {
        public string Id { get; set; }
        public string Username { get; set; }
        public string Password { get; set; }
        public string Role { get; set; } = "user"; // "user" hoặc "admin"
        public DateTime CreatedAt { get; set; }
        public DateTime LastLogin { get; set; }
        public bool IsActive { get; set; } = true;

        // Kiểm tra quyền Admin
        public bool IsAdmin => Role == "admin";

        public string FormattedCreatedAt => CreatedAt.ToString("dd/MM/yyyy HH:mm");
        public string FormattedLastLogin => LastLogin.ToString("dd/MM/yyyy HH:mm");
        public string DisplayName => Username;
    }
}