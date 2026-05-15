namespace HealthMonitorApp1.Models
{
    public class HealthRecommendation
    {
        public string Title { get; set; }
        public string Message { get; set; }
        public string Icon { get; set; }
        public string Color { get; set; }
        public RecommendationType Type { get; set; }
        public int Priority { get; set; } // 1: Cao, 2: Trung bình, 3: Thấp
    }

    public enum RecommendationType
    {
        Temperature,
        HeartRate,
        SpO2,
        General
    }

    public static class RecommendationData
    {
        public static List<HealthRecommendation> GetRecommendations(double temperature, int heartRate, int spo2)
        {
            var recommendations = new List<HealthRecommendation>();

            // Gợi ý về nhiệt độ
            if (temperature > 37.5)
            {
                recommendations.Add(new HealthRecommendation
                {
                    Title = "🌡️ Sốt nhẹ",
                    Message = $"Nhiệt độ {temperature:F1}°C cao hơn bình thường. Hãy nghỉ ngơi, uống nhiều nước và theo dõi thêm.",
                    Icon = "🌡️",
                    Color = "#E74C3C",
                    Type = RecommendationType.Temperature,
                    Priority = 1
                });
            }
            else if (temperature > 38.5)
            {
                recommendations.Add(new HealthRecommendation
                {
                    Title = "⚠️ Sốt cao",
                    Message = $"Nhiệt độ {temperature:F1}°C rất cao. Nên dùng thuốc hạ sốt và đi khám bác sĩ nếu không giảm.",
                    Icon = "⚠️",
                    Color = "#C0392B",
                    Type = RecommendationType.Temperature,
                    Priority = 1
                });
            }
            else if (temperature < 35.5)
            {
                recommendations.Add(new HealthRecommendation
                {
                    Title = "❄️ Hạ thân nhiệt",
                    Message = $"Nhiệt độ {temperature:F1}°C thấp. Giữ ấm cơ thể, uống nước ấm và theo dõi.",
                    Icon = "❄️",
                    Color = "#3498DB",
                    Type = RecommendationType.Temperature,
                    Priority = 1
                });
            }
            else if (temperature >= 36.5 && temperature <= 37.5)
            {
                recommendations.Add(new HealthRecommendation
                {
                    Title = "✅ Nhiệt độ bình thường",
                    Message = $"Nhiệt độ {temperature:F1}°C ở mức lý tưởng. Duy trì chế độ sinh hoạt lành mạnh.",
                    Icon = "✅",
                    Color = "#27AE60",
                    Type = RecommendationType.Temperature,
                    Priority = 3
                });
            }

            // Gợi ý về nhịp tim
            if (heartRate > 100)
            {
                recommendations.Add(new HealthRecommendation
                {
                    Title = "💓 Nhịp tim nhanh",
                    Message = $"Nhịp tim {heartRate} BPM cao. Hít thở sâu, thư giãn và tránh căng thẳng.",
                    Icon = "💓",
                    Color = "#E67E22",
                    Type = RecommendationType.HeartRate,
                    Priority = 1
                });
            }
            else if (heartRate < 60)
            {
                recommendations.Add(new HealthRecommendation
                {
                    Title = "🐢 Nhịp tim chậm",
                    Message = $"Nhịp tim {heartRate} BPM thấp. Nếu cảm thấy chóng mặt hoặc mệt mỏi, hãy đi khám.",
                    Icon = "🐢",
                    Color = "#F39C12",
                    Type = RecommendationType.HeartRate,
                    Priority = 2
                });
            }
            else if (heartRate >= 60 && heartRate <= 100)
            {
                recommendations.Add(new HealthRecommendation
                {
                    Title = "💚 Nhịp tim bình thường",
                    Message = $"Nhịp tim {heartRate} BPM ở mức ổn định. Tiếp tục tập thể dục đều đặn.",
                    Icon = "💚",
                    Color = "#27AE60",
                    Type = RecommendationType.HeartRate,
                    Priority = 3
                });
            }

            // Gợi ý về SpO2
            if (spo2 < 90)
            {
                recommendations.Add(new HealthRecommendation
                {
                    Title = "🚨 Thiếu oxy nghiêm trọng",
                    Message = $"SpO2 {spo2}% quá thấp! Cần cấp cứu ngay. Gọi xe cấp cứu hoặc đến bệnh viện.",
                    Icon = "🚨",
                    Color = "#C0392B",
                    Type = RecommendationType.SpO2,
                    Priority = 1
                });
            }
            else if (spo2 < 95)
            {
                recommendations.Add(new HealthRecommendation
                {
                    Title = "⚠️ Giảm oxy máu",
                    Message = $"SpO2 {spo2}% thấp. Hít thở sâu, ra nơi thoáng khí và theo dõi.",
                    Icon = "⚠️",
                    Color = "#F39C12",
                    Type = RecommendationType.SpO2,
                    Priority = 1
                });
            }
            else if (spo2 >= 95)
            {
                recommendations.Add(new HealthRecommendation
                {
                    Title = "🫁 Oxy máu tốt",
                    Message = $"SpO2 {spo2}% ở mức lý tưởng. Duy trì tập thể dục và ăn uống lành mạnh.",
                    Icon = "🫁",
                    Color = "#27AE60",
                    Type = RecommendationType.SpO2,
                    Priority = 3
                });
            }

            // Sắp xếp theo độ ưu tiên
            return recommendations.OrderBy(r => r.Priority).ToList();
        }
    }
}