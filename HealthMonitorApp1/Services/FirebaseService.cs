using Firebase.Database;
using Firebase.Database.Query;
using HealthMonitorApp1.Models;
using HealthMonitorApp1.Views;
using System.Collections.ObjectModel;
using System.Timers;
using Timer = System.Timers.Timer;

namespace HealthMonitorApp1.Services
{
    public class FirebaseService
    {
        private FirebaseClient firebase;
        private const string FirebaseUrl = "https://baochay-8ae78-default-rtdb.firebaseio.com/";
        private readonly AuthService _authService;
        private Timer _dataProcessingTimer;
        private DateTime _lastProcessedTime;
        private HealthData _cachedLatestData;
        private ObservableCollection<HealthData> _cachedHistory;
        private bool _isProcessing = false;

        public FirebaseService(AuthService authService)
        {
            firebase = new FirebaseClient(FirebaseUrl);
            _authService = authService;
            _cachedHistory = new ObservableCollection<HealthData>();
            _lastProcessedTime = DateTime.MinValue;

            StartDataProcessing();
        }

        private void StartDataProcessing()
        {
            _dataProcessingTimer = new Timer(2000);
            _dataProcessingTimer.Elapsed += OnTimerElapsed;
            _dataProcessingTimer.AutoReset = true;
            _dataProcessingTimer.Start();
        }

        private async void OnTimerElapsed(object sender, ElapsedEventArgs e)
        {
            await ProcessNewData();
        }

        // Gửi gợi ý từ admin đến user
        public async Task<bool> SendSuggestionToUser(string userId, string username, string message, string adminName)
        {
            try
            {
                var suggestionId = Guid.NewGuid().ToString();

                // 🔥 QUAN TRỌNG: Lấy giá trị thời gian thực, KHÔNG phải chuỗi định dạng
                var currentTime = DateTime.Now.ToString("yyyy-MM-dd HH:mm:ss");

                System.Diagnostics.Debug.WriteLine($"Thời gian gửi: {currentTime}");  // Debug kiểm tra

                var suggestionData = new
                {
                    id = suggestionId,
                    userId = userId,
                    username = username,
                    message = message,
                    createdAt = currentTime,  // Phải là giá trị như "2026-05-11 14:30:25"
                    adminName = adminName
                };

                await firebase
                    .Child("admin_suggestions")
                    .Child(userId)
                    .Child(suggestionId)
                    .PutAsync(suggestionData);

                return true;
            }
            catch (Exception ex)
            {
                System.Diagnostics.Debug.WriteLine($"Lỗi: {ex.Message}");
                return false;
            }
        }

        // Lấy tất cả gợi ý của user hiện tại
        public async Task<List<AdminSuggestion>> GetSuggestionsForCurrentUser()
        {
            var list = new List<AdminSuggestion>();
            try
            {
                if (!_authService.IsLoggedIn) return list;

                var userId = _authService.CurrentUser.Id;

                var suggestions = await firebase
                    .Child("admin_suggestions")
                    .Child(userId)
                    .OnceAsync<AdminSuggestion>();

                foreach (var s in suggestions)
                {
                    var item = s.Object;
                    // 🔥 Đảm bảo CreatedAt không bị null
                    if (string.IsNullOrEmpty(item.CreatedAt))
                    {
                        item.CreatedAt = DateTime.Now.ToString("yyyy-MM-dd HH:mm:ss");
                    }
                    list.Add(item);
                }

                return list.OrderByDescending(s => s.CreatedAt).ToList();
            }
            catch (Exception ex)
            {
                System.Diagnostics.Debug.WriteLine($"Lỗi: {ex.Message}");
                return list;
            }
        }

        private async Task ProcessNewData()
        {
            if (_isProcessing) return;
            _isProcessing = true;

            try
            {
                if (!_authService.IsLoggedIn) return;

                // Kiểm tra user có còn active không
                var isActive = await _authService.IsCurrentUserActive();
                if (!isActive)
                {
                    System.Diagnostics.Debug.WriteLine("User không còn active, tự động đăng xuất");
                    _authService.Logout();
                    MainThread.BeginInvokeOnMainThread(() =>
                    {
                        Application.Current.MainPage = new NavigationPage(new LoginPage());
                    });
                    return;
                }

                // Lấy thông tin session của user hiện tại
                var sessionInfo = await GetUserSessionInfo(_authService.CurrentUser.Id);
                if (sessionInfo == null)
                {
                    System.Diagnostics.Debug.WriteLine("Không tìm thấy session info");
                    return;
                }

                var sessionStartTime = DateTime.TryParse(sessionInfo.sessionStart, out var sessionStart)
                    ? sessionStart : DateTime.MinValue;

                // Lấy dữ liệu từ node now
                var nowData = await firebase
                    .Child("now")
                    .OnceSingleAsync<FirebaseHealthData>();

                if (nowData == null) return;

                if (!DateTime.TryParse(nowData.time, out var measureTime)) return;

                // 🔥 QUAN TRỌNG: Kiểm tra thời gian đo phải lớn hơn thời gian sessionStart
                if (measureTime <= sessionStartTime)
                {
                    System.Diagnostics.Debug.WriteLine($"Bỏ qua dữ liệu: Thời gian đo {measureTime} <= Thời gian session bắt đầu {sessionStartTime}");
                    return;
                }

                // Kiểm tra dữ liệu đã xử lý chưa
                if (measureTime <= _lastProcessedTime) return;

                var userId = _authService.CurrentUser.Id;

                // Lưu dữ liệu cho user hiện tại
                var healthData = new HealthData
                {
                    MeasurementTime = measureTime,
                    Temperature = nowData.temp,
                    HeartRate = nowData.hr,
                    SpO2 = nowData.spo2
                };

                var userNowData = new
                {
                    temp = healthData.Temperature,
                    hr = healthData.HeartRate,
                    spo2 = healthData.SpO2,
                    time = healthData.MeasurementTime.ToString("yyyy-MM-dd HH:mm:ss"),
                    lastUpdate = DateTime.Now.ToString("yyyy-MM-dd HH:mm:ss")
                };

                await firebase
                    .Child("user_data")
                    .Child(userId)
                    .Child("now")
                    .PutAsync(userNowData);

                await firebase
                    .Child("user_data")
                    .Child(userId)
                    .Child("history")
                    .PostAsync(userNowData);

                // Cập nhật cache
                _cachedLatestData = healthData;
                _cachedHistory.Insert(0, healthData);

                if (_cachedHistory.Count > 100)
                {
                    _cachedHistory.RemoveAt(_cachedHistory.Count - 1);
                }

                _lastProcessedTime = measureTime;

                System.Diagnostics.Debug.WriteLine($"Đã lưu dữ liệu cho user {userId} lúc {measureTime} (Session bắt đầu: {sessionStartTime})");
            }
            catch (Exception ex)
            {
                System.Diagnostics.Debug.WriteLine($"Lỗi xử lý dữ liệu: {ex.Message}");
            }
            finally
            {
                _isProcessing = false;
            }
        }

        // 🔥 THÊM: Lấy thông tin session của user
        private async Task<UserSessionInfo> GetUserSessionInfo(string userId)
        {
            try
            {
                var session = await firebase
                    .Child("user_sessions")
                    .Child(userId)
                    .OnceSingleAsync<UserSessionInfo>();

                return session;
            }
            catch (Exception ex)
            {
                System.Diagnostics.Debug.WriteLine($"Lỗi lấy session info: {ex.Message}");
                return null;
            }
        }

        // Lấy dữ liệu mới nhất của user hiện tại
        public async Task<HealthData> GetLatestHealthDataAsync()
        {
            try
            {
                if (!_authService.IsLoggedIn) return null;

                if (_cachedLatestData != null)
                    return _cachedLatestData;

                var userId = _authService.CurrentUser.Id;

                var userNowData = await firebase
                    .Child("user_data")
                    .Child(userId)
                    .Child("now")
                    .OnceSingleAsync<UserHealthData>();

                if (userNowData != null)
                {
                    return new HealthData
                    {
                        MeasurementTime = DateTime.TryParse(userNowData.time, out var time) ? time : DateTime.Now,
                        Temperature = userNowData.temp,
                        HeartRate = userNowData.hr,
                        SpO2 = userNowData.spo2
                    };
                }
            }
            catch (Exception ex)
            {
                System.Diagnostics.Debug.WriteLine($"Lỗi lấy dữ liệu: {ex.Message}");
            }
            return null;
        }

        // Lấy lịch sử của user hiện tại
        public async Task<ObservableCollection<HealthData>> GetHistoryDataAsync(int limit = 50)
        {
            var historyList = new ObservableCollection<HealthData>();

            try
            {
                if (!_authService.IsLoggedIn) return historyList;

                var userId = _authService.CurrentUser.Id;

                var historyData = await firebase
                    .Child("user_data")
                    .Child(userId)
                    .Child("history")
                    .OrderByKey()
                    .LimitToLast(limit)
                    .OnceAsync<UserHealthData>();

                foreach (var item in historyData.OrderByDescending(x => x.Key))
                {
                    if (item.Object != null && !string.IsNullOrEmpty(item.Object.time))
                    {
                        historyList.Add(new HealthData
                        {
                            MeasurementTime = DateTime.TryParse(item.Object.time, out var parsedTime) ? parsedTime : DateTime.Now,
                            Temperature = item.Object.temp,
                            HeartRate = item.Object.hr,
                            SpO2 = item.Object.spo2
                        });
                    }
                }
            }
            catch (Exception ex)
            {
                System.Diagnostics.Debug.WriteLine($"Lỗi lấy lịch sử: {ex.Message}");
            }

            return historyList;
        }

        // Cho Admin: Lấy lịch sử của user khác
        public async Task<ObservableCollection<HealthData>> GetHistoryDataByUserId(string userId, int limit = 50)
        {
            var historyList = new ObservableCollection<HealthData>();

            try
            {
                if (string.IsNullOrEmpty(userId)) return historyList;

                var historyData = await firebase
                    .Child("user_data")
                    .Child(userId)
                    .Child("history")
                    .OrderByKey()
                    .LimitToLast(limit)
                    .OnceAsync<UserHealthData>();

                foreach (var item in historyData.OrderByDescending(x => x.Key))
                {
                    if (item.Object != null && !string.IsNullOrEmpty(item.Object.time))
                    {
                        historyList.Add(new HealthData
                        {
                            MeasurementTime = DateTime.TryParse(item.Object.time, out var parsedTime) ? parsedTime : DateTime.Now,
                            Temperature = item.Object.temp,
                            HeartRate = item.Object.hr,
                            SpO2 = item.Object.spo2
                        });
                    }
                }
            }
            catch (Exception ex)
            {
                System.Diagnostics.Debug.WriteLine($"Lỗi lấy lịch sử user {userId}: {ex.Message}");
            }

            return historyList;
        }

        // Cho Admin: Lấy dữ liệu mới nhất của user khác
        public async Task<HealthData> GetLatestHealthDataByUserId(string userId)
        {
            try
            {
                if (string.IsNullOrEmpty(userId)) return null;

                var userNowData = await firebase
                    .Child("user_data")
                    .Child(userId)
                    .Child("now")
                    .OnceSingleAsync<UserHealthData>();

                if (userNowData != null)
                {
                    return new HealthData
                    {
                        MeasurementTime = DateTime.TryParse(userNowData.time, out var time) ? time : DateTime.Now,
                        Temperature = userNowData.temp,
                        HeartRate = userNowData.hr,
                        SpO2 = userNowData.spo2
                    };
                }
            }
            catch (Exception ex)
            {
                System.Diagnostics.Debug.WriteLine($"Lỗi lấy dữ liệu user {userId}: {ex.Message}");
            }
            return null;
        }

        public void Dispose()
        {
            _dataProcessingTimer?.Stop();
            _dataProcessingTimer?.Dispose();
        }

        private class FirebaseHealthData
        {
            public double temp { get; set; }
            public int hr { get; set; }
            public int spo2 { get; set; }
            public string time { get; set; }
        }

        private class UserHealthData
        {
            public double temp { get; set; }
            public int hr { get; set; }
            public int spo2 { get; set; }
            public string time { get; set; }
            public string lastUpdate { get; set; }
        }

        // 🔥 THÊM: Class lưu thông tin session
        private class UserSessionInfo
        {
            public bool isActive { get; set; }
            public string sessionStart { get; set; }
            public string sessionEnd { get; set; }
            public string userId { get; set; }
        }
    }
}