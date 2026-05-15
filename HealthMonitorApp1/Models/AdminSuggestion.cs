namespace HealthMonitorApp1.Models
{
    public class AdminSuggestion
    {
        public string Id { get; set; } = string.Empty;
        public string UserId { get; set; } = string.Empty;
        public string Username { get; set; } = string.Empty;
        public string Message { get; set; } = string.Empty;

        // 🔥 SỬA: Đổi từ DateTime sang string
        public string CreatedAt { get; set; } = string.Empty;

        public bool IsRead { get; set; }
        public string AdminName { get; set; } = string.Empty;

        // 🔥 THÊM: Property để hiển thị ngày giờ đã format
        public string FormattedCreatedAt
        {
            get
            {
                if (DateTime.TryParse(CreatedAt, out var date))
                    return date.ToString("dd/MM/yyyy HH:mm:ss");
                return CreatedAt;
            }
        }
    }
}