using HealthMonitorApp1.Models;
using HealthMonitorApp1.Services;
using HealthMonitorApp1.Views;
using Microsoft.Extensions.DependencyInjection;

namespace HealthMonitorApp1
{
    public partial class MainPage : ContentPage
    {
        private System.Timers.Timer clockTimer;
        private System.Timers.Timer refreshTimer;
        private System.Timers.Timer sessionCheckTimer;
        private FirebaseService _firebaseService;
        private AuthService _authService;
        private System.Timers.Timer suggestionCheckTimer;

        public MainPage(AuthService authService, FirebaseService firebaseService)
        {
            InitializeComponent();
            _authService = authService;
            _firebaseService = firebaseService;

            StartClock();
            StartAutoRefresh();
            StartSessionCheck();
            LoadRealTimeData();
            StartSuggestionCheck();
            if (_authService.CurrentUser != null)
            {
                Title = $"Xin chào, {_authService.CurrentUser.Username}";
            }
        }

        private async Task LoadAdminSuggestions()
        {
            try
            {
                if (!_authService.IsLoggedIn)
                {
                    System.Diagnostics.Debug.WriteLine("Chưa đăng nhập, không tải gợi ý");
                    return;
                }

                System.Diagnostics.Debug.WriteLine("=== ĐANG TẢI GỢI Ý TỪ ADMIN ===");

                var suggestions = await _firebaseService.GetSuggestionsForCurrentUser();

                System.Diagnostics.Debug.WriteLine($"Nhận được {suggestions?.Count ?? 0} gợi ý");

                MainThread.BeginInvokeOnMainThread(() =>
                {
                    if (suggestions != null && suggestions.Count > 0)
                    {
                        foreach (var s in suggestions)
                        {
                            System.Diagnostics.Debug.WriteLine($"Hiển thị: {s.Message}");
                        }

                        var latestSuggestions = suggestions.Take(5).ToList();
                        SuggestionsCollectionView.ItemsSource = latestSuggestions;
                        AdminSuggestionFrame.IsVisible = true;
                        NoSuggestionLabel.IsVisible = false;
                    }
                    else
                    {
                        AdminSuggestionFrame.IsVisible = true;
                        NoSuggestionLabel.IsVisible = true;
                        SuggestionsCollectionView.ItemsSource = null;
                    }
                });
            }
            catch (Exception ex)
            {
                System.Diagnostics.Debug.WriteLine($"Lỗi tải gợi ý: {ex.Message}");
            }
        }

        private void StartSuggestionCheck()
        {
            suggestionCheckTimer = new System.Timers.Timer(10000); // Kiểm tra mỗi 10 giây
            suggestionCheckTimer.Elapsed += async (s, e) =>
            {
                await LoadAdminSuggestions();
            };
            suggestionCheckTimer.AutoReset = true;
            suggestionCheckTimer.Start();
        }
        private void StartClock()
        {
            clockTimer = new System.Timers.Timer(1000);
            clockTimer.Elapsed += (s, e) =>
            {
                MainThread.BeginInvokeOnMainThread(() =>
                {
                    CurrentTimeLabel.Text = DateTime.Now.ToString("dd/MM/yyyy HH:mm:ss");
                });
            };
            clockTimer.Start();
        }

        private void StartAutoRefresh()
        {
            refreshTimer = new System.Timers.Timer(5000);
            refreshTimer.Elapsed += async (s, e) =>
            {
                await LoadRealTimeData();
            };
            refreshTimer.Start();
        }

        private void StartSessionCheck()
        {
            sessionCheckTimer = new System.Timers.Timer(3000);
            sessionCheckTimer.Elapsed += async (s, e) =>
            {
                await CheckSessionActive();
            };
            sessionCheckTimer.Start();
        }

        private async Task CheckSessionActive()
        {
            try
            {
                if (_authService.IsLoggedIn)
                {
                    var isActive = await _authService.IsCurrentUserActive();
                    if (!isActive)
                    {
                        System.Diagnostics.Debug.WriteLine("Session không còn active, tự động đăng xuất");

                        MainThread.BeginInvokeOnMainThread(async () =>
                        {
                            _authService.Logout();
                            await DisplayAlert("Thông báo", "Tài khoản đã được đăng nhập từ thiết bị khác!", "OK");
                            Application.Current.MainPage = new NavigationPage(new LoginPage());
                        });
                    }
                }
            }
            catch (Exception ex)
            {
                System.Diagnostics.Debug.WriteLine($"Lỗi kiểm tra session: {ex.Message}");
            }
        }

        private async Task LoadRealTimeData()
        {
            try
            {
                if (!_authService.IsLoggedIn) return;

                var isActive = await _authService.IsCurrentUserActive();
                if (!isActive)
                {
                    MainThread.BeginInvokeOnMainThread(async () =>
                    {
                        _authService.Logout();
                        await DisplayAlert("Thông báo", "Tài khoản đã được đăng nhập từ thiết bị khác!", "OK");
                        Application.Current.MainPage = new NavigationPage(new LoginPage());
                    });
                    return;
                }

                var data = await _firebaseService.GetLatestHealthDataAsync();

                if (data != null)
                {
                    MainThread.BeginInvokeOnMainThread(() =>
                    {
                        // Cập nhật dữ liệu cũ (chỉ cập nhật nếu có dữ liệu)
                        TemperatureLabel.Text = data.HasTemperature ? data.FormattedTemperature : "--- °C";
                        HeartRateLabel.Text = data.HasHeartRate ? data.FormattedHeartRate : "--- BPM";
                        SpO2Label.Text = data.HasSpO2 ? data.FormattedSpO2 : "---%";
                        SpO2StatusLabel.Text = data.HasSpO2 ? data.SpO2Status : "Không có dữ liệu";

                        DetailTemperature.Text = data.HasTemperature ? $"{data.Temperature:F1}°C" : "---°C";
                        DetailHeartRate.Text = data.HasHeartRate ? $"{data.HeartRate} BPM" : "--- BPM";
                        DetailSpO2.Text = data.HasSpO2 ? $"{data.SpO2}%" : "---%";
                        DetailLastUpdate.Text = data.MeasurementTime.ToString("HH:mm:ss");

                        if (data.HasSpO2)
                        {
                            SpO2ProgressBar.Color = data.SpO2Color;
                        }
                        else
                        {
                            SpO2ProgressBar.Color = Colors.Gray;
                        }

                        // 🔥 Hiển thị gợi ý - Chỉ truyền dữ liệu có thật
                        ShowRecommendations(
                            data.HasTemperature ? data.Temperature : -1,  // Gửi -1 nếu không có dữ liệu
                            data.HasHeartRate ? data.HeartRate : -1,
                            data.HasSpO2 ? data.SpO2 : -1
                        );
                    });
                }
                else
                {
                    MainThread.BeginInvokeOnMainThread(() =>
                    {
                        // Không có dữ liệu, ẩn gợi ý
                        RecommendationFrame.IsVisible = false;
                    });
                }
            }
            catch (Exception ex)
            {
                System.Diagnostics.Debug.WriteLine($"Lỗi tải dữ liệu: {ex.Message}");
            }
        }

        // 🔥 THÊM: Phương thức hiển thị gợi ý sức khỏe
        // 🔥 SỬA: Phương thức hiển thị gợi ý sức khỏe - Chỉ hiển thị khi có dữ liệu
        private void ShowRecommendations(double temperature, int heartRate, int spo2)
        {
            try
            {
                // Kiểm tra dữ liệu có hợp lệ không
                bool hasValidTemperature = temperature > 0 && temperature < 50; // Nhiệt độ hợp lệ 0-50°C
                bool hasValidHeartRate = heartRate > 0 && heartRate < 250; // Nhịp tim hợp lệ 1-250
                bool hasValidSpO2 = spo2 > 0 && spo2 <= 100; // SpO2 hợp lệ 1-100%

                var recommendations = new List<RecommendationItem>();

                // 🔥 CHỈ thêm gợi ý nhiệt độ nếu có dữ liệu hợp lệ
                if (hasValidTemperature)
                {
                    if (temperature > 38.5)
                    {
                        recommendations.Add(new RecommendationItem
                        {
                            Icon = "🚨",
                            Title = "Sốt cao!",
                            Message = $"Nhiệt độ {temperature:F1}°C rất cao. Cần dùng thuốc hạ sốt và đi khám ngay!",
                            Priority = 1,
                            Color = "#C0392B"
                        });
                    }
                    else if (temperature > 37.5)
                    {
                        recommendations.Add(new RecommendationItem
                        {
                            Icon = "🌡️",
                            Title = "Sốt nhẹ",
                            Message = $"Nhiệt độ {temperature:F1}°C cao hơn bình thường. Nghỉ ngơi, uống nhiều nước.",
                            Priority = 1,
                            Color = "#E74C3C"
                        });
                    }
                    else if (temperature < 35.5)
                    {
                        recommendations.Add(new RecommendationItem
                        {
                            Icon = "❄️",
                            Title = "Hạ thân nhiệt",
                            Message = $"Nhiệt độ {temperature:F1}°C thấp. Giữ ấm cơ thể, uống nước ấm.",
                            Priority = 1,
                            Color = "#3498DB"
                        });
                    }
                    else if (temperature >= 36.5 && temperature <= 37.5)
                    {
                        recommendations.Add(new RecommendationItem
                        {
                            Icon = "✅",
                            Title = "Nhiệt độ bình thường",
                            Message = $"Nhiệt độ {temperature:F1}°C lý tưởng. Duy trì chế độ lành mạnh.",
                            Priority = 3,
                            Color = "#27AE60"
                        });
                    }
                    else
                    {
                        recommendations.Add(new RecommendationItem
                        {
                            Icon = "⚠️",
                            Title = "Theo dõi nhiệt độ",
                            Message = $"Nhiệt độ {temperature:F1}°C cần theo dõi thêm.",
                            Priority = 2,
                            Color = "#F39C12"
                        });
                    }
                }
                else
                {
                    System.Diagnostics.Debug.WriteLine("Không có dữ liệu nhiệt độ hợp lệ, bỏ qua gợi ý nhiệt độ");
                }

                // 🔥 CHỈ thêm gợi ý nhịp tim nếu có dữ liệu hợp lệ
                if (hasValidHeartRate)
                {
                    if (heartRate > 120)
                    {
                        recommendations.Add(new RecommendationItem
                        {
                            Icon = "🚨",
                            Title = "Nhịp tim quá nhanh!",
                            Message = $"Nhịp tim {heartRate} BPM quá cao. Cần cấp cứu ngay!",
                            Priority = 1,
                            Color = "#C0392B"
                        });
                    }
                    else if (heartRate > 100)
                    {
                        recommendations.Add(new RecommendationItem
                        {
                            Icon = "💓",
                            Title = "Nhịp tim nhanh",
                            Message = $"Nhịp tim {heartRate} BPM. Hít thở sâu, thư giãn, tránh căng thẳng.",
                            Priority = 1,
                            Color = "#E67E22"
                        });
                    }
                    else if (heartRate < 60)
                    {
                        recommendations.Add(new RecommendationItem
                        {
                            Icon = "🐢",
                            Title = "Nhịp tim chậm",
                            Message = $"Nhịp tim {heartRate} BPM. Nếu chóng mặt hoặc mệt mỏi, hãy đi khám.",
                            Priority = 2,
                            Color = "#F39C12"
                        });
                    }
                    else if (heartRate >= 60 && heartRate <= 100)
                    {
                        recommendations.Add(new RecommendationItem
                        {
                            Icon = "💚",
                            Title = "Nhịp tim bình thường",
                            Message = $"Nhịp tim {heartRate} BPM ổn định. Tiếp tục tập thể dục đều đặn.",
                            Priority = 3,
                            Color = "#27AE60"
                        });
                    }
                }
                else
                {
                    System.Diagnostics.Debug.WriteLine("Không có dữ liệu nhịp tim hợp lệ, bỏ qua gợi ý nhịp tim");
                }

                // 🔥 CHỈ thêm gợi ý SpO2 nếu có dữ liệu hợp lệ
                if (hasValidSpO2)
                {
                    if (spo2 < 85)
                    {
                        recommendations.Add(new RecommendationItem
                        {
                            Icon = "🚨",
                            Title = "THIẾU OXY NGHIÊM TRỌNG!",
                            Message = $"SpO2 {spo2}% quá thấp! CẤP CỨU NGAY!",
                            Priority = 1,
                            Color = "#C0392B"
                        });
                    }
                    else if (spo2 < 90)
                    {
                        recommendations.Add(new RecommendationItem
                        {
                            Icon = "⚠️",
                            Title = "Thiếu oxy nguy hiểm",
                            Message = $"SpO2 {spo2}% rất thấp. Đến bệnh viện ngay!",
                            Priority = 1,
                            Color = "#E74C3C"
                        });
                    }
                    else if (spo2 < 95)
                    {
                        recommendations.Add(new RecommendationItem
                        {
                            Icon = "🫁",
                            Title = "Giảm oxy máu",
                            Message = $"SpO2 {spo2}% thấp. Hít thở sâu, ra nơi thoáng khí.",
                            Priority = 1,
                            Color = "#F39C12"
                        });
                    }
                    else if (spo2 >= 95)
                    {
                        recommendations.Add(new RecommendationItem
                        {
                            Icon = "💪",
                            Title = "Oxy máu tốt",
                            Message = $"SpO2 {spo2}% ở mức lý tưởng. Duy trì sức khỏe!",
                            Priority = 3,
                            Color = "#27AE60"
                        });
                    }
                }
                else
                {
                    System.Diagnostics.Debug.WriteLine("Không có dữ liệu SpO2 hợp lệ, bỏ qua gợi ý SpO2");
                }

                // 🔥 Nếu không có bất kỳ gợi ý nào (do thiếu dữ liệu), ẩn frame
                if (recommendations.Count == 0)
                {
                    MainThread.BeginInvokeOnMainThread(() =>
                    {
                        RecommendationFrame.IsVisible = false;
                    });
                    return;
                }

                // Sắp xếp theo độ ưu tiên và hiển thị gợi ý quan trọng nhất
                var topRecommendation = recommendations.OrderBy(r => r.Priority).FirstOrDefault();

                if (topRecommendation != null)
                {
                    MainThread.BeginInvokeOnMainThread(() =>
                    {
                        RecommendationTitle.Text = topRecommendation.Title;
                        RecommendationMessage.Text = topRecommendation.Message;
                        RecommendationIcon.Text = topRecommendation.Icon;

                        // Đổi màu frame theo mức độ ưu tiên
                        if (topRecommendation.Priority == 1)
                        {
                            RecommendationFrame.BackgroundColor = Color.FromArgb("#FFE5E5");
                            RecommendationFrame.BorderColor = Color.FromArgb("#E74C3C");
                        }
                        else if (topRecommendation.Priority == 2)
                        {
                            RecommendationFrame.BackgroundColor = Color.FromArgb("#FFF9E6");
                            RecommendationFrame.BorderColor = Color.FromArgb("#F39C12");
                        }
                        else
                        {
                            RecommendationFrame.BackgroundColor = Color.FromArgb("#E8F8F5");
                            RecommendationFrame.BorderColor = Color.FromArgb("#27AE60");
                        }

                        RecommendationFrame.IsVisible = true;
                    });
                }
                else
                {
                    MainThread.BeginInvokeOnMainThread(() =>
                    {
                        RecommendationFrame.IsVisible = false;
                    });
                }
            }
            catch (Exception ex)
            {
                System.Diagnostics.Debug.WriteLine($"Lỗi hiển thị gợi ý: {ex.Message}");
            }
        }

        private async void ViewHistoryButton_Clicked(object sender, EventArgs e)
        {
            await Navigation.PushAsync(new HistoryPage(_firebaseService));
        }

        protected override void OnDisappearing()
        {
            base.OnDisappearing();
            clockTimer?.Stop();
            clockTimer?.Dispose();
            refreshTimer?.Stop();
            refreshTimer?.Dispose();
            sessionCheckTimer?.Stop();
            sessionCheckTimer?.Dispose();

            // 🔥 Dọn dẹp timer gợi ý
            if (suggestionCheckTimer != null)
            {
                suggestionCheckTimer.Stop();
                suggestionCheckTimer.Dispose();
                suggestionCheckTimer = null;
            }
        }

        private async void LogoutButton_Clicked(object sender, EventArgs e)
        {
            var result = await DisplayAlert("Xác nhận", "Bạn có chắc muốn đăng xuất?", "Có", "Không");
            if (result)
            {
                _authService.Logout();
                Application.Current.MainPage = new NavigationPage(new LoginPage());
            }
        }

        protected override async void OnAppearing()
        {
            base.OnAppearing();
            await LoadAdminSuggestions();
            System.Diagnostics.Debug.WriteLine("=== MainPage OnAppearing ===");
            if (_authService.IsLoggedIn)
            {
                var isActive = await _authService.IsCurrentUserActive();
                if (!isActive)
                {
                    _authService.Logout();
                    Application.Current.MainPage = new NavigationPage(new LoginPage());
                    return;
                }
            }

            if (_authService.CurrentUser != null)
            {
                Title = $"Xin chào, {_authService.CurrentUser.Username}";
            }

            if (_authService.IsAdmin && !(FindByName("AdminButton") is Button))
            {
                var adminButton = new Button
                {
                    StyleId = "AdminButton",
                    Text = "👑 ADMIN DASHBOARD",
                    FontSize = 16,
                    BackgroundColor = Color.FromArgb("#E74C3C"),
                    TextColor = Colors.White,
                    CornerRadius = 25,
                    HeightRequest = 45,
                    Margin = new Thickness(0, 10, 0, 0)
                };
                adminButton.Clicked += AdminButton_Clicked;

                var parent = (VerticalStackLayout)LogoutButton.Parent;
                parent.Children.Insert(parent.Children.IndexOf(LogoutButton), adminButton);
            }
        }

        private async void AdminButton_Clicked(object sender, EventArgs e)
        {
            await Navigation.PushAsync(new AdminDashboardPage(_authService, _firebaseService));
        }
    }
}

// 🔥 THÊM: Class RecommendationItem ở cuối file hoặc trong file riêng
public class RecommendationItem
{
    public string Icon { get; set; }
    public string Title { get; set; }
    public string Message { get; set; }
    public int Priority { get; set; }
    public string Color { get; set; }
}