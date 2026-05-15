using System;

namespace HealthMonitorApp1.Models
{
    public class HealthData
    {
        public DateTime MeasurementTime { get; set; }
        public double Temperature { get; set; }
        public int HeartRate { get; set; }
        public int SpO2 { get; set; }

        // Kiểm tra dữ liệu có hợp lệ không
        public bool HasTemperature => Temperature > 0; // Nhiệt độ hợp lệ > 0°C
        public bool HasHeartRate => HeartRate > 0 && HeartRate < 250; // Nhịp tim hợp lệ 1-250
        public bool HasSpO2 => SpO2 > 0 && SpO2 <= 100; // SpO2 hợp lệ 1-100%

        public string FormattedTime => MeasurementTime.ToString("dd/MM/yyyy HH:mm:ss");

        public string FormattedTemperature => HasTemperature ? $"{Temperature:F1}°C" : "---";
        public string FormattedHeartRate => HasHeartRate ? $"{HeartRate} BPM" : "---";
        public string FormattedSpO2 => HasSpO2 ? $"{SpO2}%" : "---";

        // Màu sắc dựa trên chỉ số SpO2 (chỉ khi có dữ liệu)
        public Color SpO2Color => HasSpO2 ? (SpO2 >= 95 ? Colors.Green : (SpO2 >= 90 ? Colors.Orange : Colors.Red)) : Colors.Gray;

        // Trạng thái SpO2
        public string SpO2Status => HasSpO2 ? (SpO2 >= 95 ? "Bình thường" : (SpO2 >= 90 ? "Cần theo dõi" : "Nguy cấp")) : "Không có dữ liệu";

        // Cảnh báo nhiệt độ (chỉ khi có dữ liệu)
        public string TemperatureWarning => HasTemperature ? (Temperature > 37.5 ? "⚠️ Sốt" : (Temperature < 35.5 ? "⚠️ Hạ thân nhiệt" : "✓ Bình thường")) : "⭕ Không có dữ liệu";

        public Color TemperatureWarningColor => HasTemperature ? (Temperature > 37.5 ? Colors.Red : (Temperature < 35.5 ? Colors.Orange : Colors.Green)) : Colors.Gray;

        // Cảnh báo nhịp tim (chỉ khi có dữ liệu)
        public string HeartRateWarning => HasHeartRate ? (HeartRate > 100 ? "⚠️ Nhịp nhanh" : (HeartRate < 60 ? "⚠️ Nhịp chậm" : "✓ Bình thường")) : "⭕ Không có dữ liệu";

        public Color HeartRateWarningColor => HasHeartRate ? (HeartRate > 100 ? Colors.Red : (HeartRate < 60 ? Colors.Orange : Colors.Green)) : Colors.Gray;

        // Cảnh báo tổng thể
        public string OverallWarning
        {
            get
            {
                var warnings = new List<string>();

                if (HasTemperature)
                {
                    if (Temperature > 37.5) warnings.Add("Sốt");
                    else if (Temperature < 35.5) warnings.Add("Hạ thân nhiệt");
                }

                if (HasHeartRate)
                {
                    if (HeartRate > 100) warnings.Add("Nhịp tim nhanh");
                    else if (HeartRate < 60) warnings.Add("Nhịp tim chậm");
                }

                if (HasSpO2 && SpO2 < 95) warnings.Add($"SpO2 thấp ({SpO2}%)");

                if (warnings.Count == 0)
                {
                    // Kiểm tra xem có ít nhất một chỉ số có dữ liệu không
                    if (HasTemperature || HasHeartRate || HasSpO2)
                        return "✓ Tất cả chỉ số bình thường";
                    else
                        return "⭕ Không có dữ liệu đo";
                }

                return string.Join(", ", warnings);
            }
        }

        public Color OverallWarningColor
        {
            get
            {
                if (!HasTemperature && !HasHeartRate && !HasSpO2)
                    return Colors.Gray;

                if ((HasTemperature && (Temperature > 37.5 || Temperature < 35.5)) ||
                    (HasHeartRate && (HeartRate > 100 || HeartRate < 60)) ||
                    (HasSpO2 && SpO2 < 95))
                    return Colors.Red;

                return Colors.Green;
            }
        }

        // Hiển thị icon cảnh báo
        public string WarningIcon
        {
            get
            {
                if (!HasTemperature && !HasHeartRate && !HasSpO2)
                    return "⭕";

                if ((HasTemperature && (Temperature > 37.5 || Temperature < 35.5)) ||
                    (HasHeartRate && (HeartRate > 100 || HeartRate < 60)) ||
                    (HasSpO2 && SpO2 < 95))
                    return "⚠️";

                return "✅";
            }
        }

        // Thêm phương thức lấy gợi ý tổng hợp
        public List<HealthRecommendation> GetRecommendations()
        {
            return RecommendationData.GetRecommendations(Temperature, HeartRate, SpO2);
        }

        // Thêm các thuộc tính này vào class HealthData
        public bool HasWarning => Temperature > 37.5 || Temperature < 35.5 ||
                                  HeartRate > 100 || HeartRate < 60 ||
                                  SpO2 < 95;

        public string RecommendationText
        {
            get
            {
                if (Temperature > 37.5) return "🌡️ Nên nghỉ ngơi và uống nhiều nước";
                if (Temperature > 38.5) return "⚠️ Cần dùng thuốc hạ sốt và theo dõi";
                if (Temperature < 35.5) return "❄️ Giữ ấm cơ thể, uống nước ấm";
                if (HeartRate > 100) return "💓 Hít thở sâu, thư giãn, tránh căng thẳng";
                if (HeartRate < 60) return "🐢 Nếu mệt mỏi, hãy đi khám bác sĩ";
                if (SpO2 < 95) return "🫁 Hít thở sâu, ra nơi thoáng khí";
                if (SpO2 < 90) return "🚨 CẤP CỨU! Gọi xe cấp cứu ngay";
                return "✅ Các chỉ số bình thường, duy trì lối sống lành mạnh";
            }
        }

        // Kiểm tra có bất kỳ dữ liệu nào không
        public bool HasAnyData => HasTemperature || HasHeartRate || HasSpO2;
    }
}