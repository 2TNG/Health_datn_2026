using HealthDataAPI2.Models;
using HealthMonitorApp1.Models;
using System.Collections.ObjectModel;
using System.Text.Json;

namespace HealthMonitorApp1.Services
{
    public class HealthApiService
    {
        private readonly HttpClient _httpClient;
        private readonly AuthService _authService;
        private const string BaseUrl = "http://192.168.1.100:5000"; // ⚠️ SỬA IP CỦA WEB API

        // Cache
        private HealthData _cachedLatestData;
        private ObservableCollection<HealthData> _cachedHistory;

        public HealthApiService(AuthService authService)
        {
            _authService = authService;
            _httpClient = new HttpClient();
            _httpClient.BaseAddress = new Uri(BaseUrl);
            _httpClient.Timeout = TimeSpan.FromSeconds(30);
            _httpClient.DefaultRequestHeaders.Accept.Add(
                new System.Net.Http.Headers.MediaTypeWithQualityHeaderValue("application/json"));

            _cachedHistory = new ObservableCollection<HealthData>();
        }

        // ===== GỬI DỮ LIỆU TỪ ESP32 LÊN =====
        public async Task<bool> SendHealthDataAsync(float temperature, int hr, int spo2, string time, int userId)
        {
            try
            {
                var data = new
                {
                    temperature = temperature,
                    hr = hr,
                    spo2 = spo2,
                    time = time,
                    userId = userId
                };

                var json = JsonSerializer.Serialize(data);
                var content = new StringContent(json, System.Text.Encoding.UTF8, "application/json");

                var response = await _httpClient.PostAsync("/api/HealthData/send", content);

                if (response.IsSuccessStatusCode)
                {
                    System.Diagnostics.Debug.WriteLine("✅ Gửi dữ liệu thành công!");
                    return true;
                }

                var error = await response.Content.ReadAsStringAsync();
                System.Diagnostics.Debug.WriteLine($"❌ Lỗi gửi dữ liệu: {error}");
                return false;
            }
            catch (Exception ex)
            {
                System.Diagnostics.Debug.WriteLine($"❌ Exception: {ex.Message}");
                return false;
            }
        }

        // ===== LẤY DỮ LIỆU MỚI NHẤT CỦA USER HIỆN TẠI =====
        public async Task<HealthData?> GetLatestHealthDataAsync()
        {
            try
            {
                if (!_authService.IsLoggedIn) return null;

                var userId = _authService.CurrentUser.UserId;
                var response = await _httpClient.GetAsync($"/api/HealthData/latest?userId={userId}");

                if (response.IsSuccessStatusCode)
                {
                    var json = await response.Content.ReadAsStringAsync();
                    var options = new JsonSerializerOptions { PropertyNameCaseInsensitive = true };
                    var data = JsonSerializer.Deserialize<HealthDataResponse>(json, options);

                    if (data != null)
                    {
                        var healthData = new HealthData
                        {
                            UserId = data.userId,
                            Temperature = data.temp,
                            HeartRate = data.hr,
                            SpO2 = data.spo2,
                            MeasurementTime = DateTime.TryParse(data.time, out var time) ? time : DateTime.Now
                        };

                        _cachedLatestData = healthData;
                        return healthData;
                    }
                }

                return _cachedLatestData;
            }
            catch (Exception ex)
            {
                System.Diagnostics.Debug.WriteLine($"Lỗi lấy dữ liệu: {ex.Message}");
                return _cachedLatestData;
            }
        }

        // ===== LẤY LỊCH SỬ CỦA USER HIỆN TẠI =====
        public async Task<ObservableCollection<HealthData>> GetHistoryDataAsync(int limit = 50)
        {
            var historyList = new ObservableCollection<HealthData>();

            try
            {
                if (!_authService.IsLoggedIn) return historyList;

                var userId = _authService.CurrentUser.UserId;
                var response = await _httpClient.GetAsync($"/api/HealthData/history?userId={userId}&limit={limit}");

                if (response.IsSuccessStatusCode)
                {
                    var json = await response.Content.ReadAsStringAsync();
                    var options = new JsonSerializerOptions { PropertyNameCaseInsensitive = true };

                    // Parse response có cấu trúc { userId, total, data }
                    var result = JsonSerializer.Deserialize<HistoryResponse>(json, options);

                    if (result != null && result.data != null)
                    {
                        foreach (var item in result.data)
                        {
                            historyList.Add(new HealthData
                            {
                                Id = item.id,
                                UserId = userId,
                                Temperature = item.temp,
                                HeartRate = item.hr,
                                SpO2 = item.spo2,
                                MeasurementTime = DateTime.TryParse(item.time, out var time) ? time : DateTime.Now
                            });
                        }
                    }
                }

                _cachedHistory = historyList;
                return historyList;
            }
            catch (Exception ex)
            {
                System.Diagnostics.Debug.WriteLine($"Lỗi lấy lịch sử: {ex.Message}");
                return historyList;
            }
        }

        // ===== CHO ADMIN: LẤY LỊCH SỬ CỦA USER KHÁC =====
        public async Task<ObservableCollection<HealthData>> GetHistoryDataByUserId(int userId, int limit = 50)
        {
            var historyList = new ObservableCollection<HealthData>();

            try
            {
                if (!_authService.IsAdmin) return historyList;

                var response = await _httpClient.GetAsync($"/api/HealthData/history?userId={userId}&limit={limit}");

                if (response.IsSuccessStatusCode)
                {
                    var json = await response.Content.ReadAsStringAsync();
                    var options = new JsonSerializerOptions { PropertyNameCaseInsensitive = true };
                    var result = JsonSerializer.Deserialize<HistoryResponse>(json, options);

                    if (result != null && result.data != null)
                    {
                        foreach (var item in result.data)
                        {
                            historyList.Add(new HealthData
                            {
                                Id = item.id,
                                UserId = userId,
                                Temperature = item.temp,
                                HeartRate = item.hr,
                                SpO2 = item.spo2,
                                MeasurementTime = DateTime.TryParse(item.time, out var time) ? time : DateTime.Now
                            });
                        }
                    }
                }

                return historyList;
            }
            catch (Exception ex)
            {
                System.Diagnostics.Debug.WriteLine($"Lỗi lấy lịch sử user {userId}: {ex.Message}");
                return historyList;
            }
        }

        // ===== CHO ADMIN: LẤY DỮ LIỆU MỚI NHẤT CỦA USER KHÁC =====
        public async Task<HealthData?> GetLatestHealthDataByUserId(int userId)
        {
            try
            {
                if (!_authService.IsAdmin) return null;

                var response = await _httpClient.GetAsync($"/api/HealthData/latest?userId={userId}");

                if (response.IsSuccessStatusCode)
                {
                    var json = await response.Content.ReadAsStringAsync();
                    var options = new JsonSerializerOptions { PropertyNameCaseInsensitive = true };
                    var data = JsonSerializer.Deserialize<HealthDataResponse>(json, options);

                    if (data != null)
                    {
                        return new HealthData
                        {
                            UserId = data.userId,
                            Temperature = data.temp,
                            HeartRate = data.hr,
                            SpO2 = data.spo2,
                            MeasurementTime = DateTime.TryParse(data.time, out var time) ? time : DateTime.Now
                        };
                    }
                }

                return null;
            }
            catch (Exception ex)
            {
                System.Diagnostics.Debug.WriteLine($"Lỗi lấy dữ liệu user {userId}: {ex.Message}");
                return null;
            }
        }

        // ===== GỬI GỢI Ý TỪ ADMIN ĐẾN USER =====
        public async Task<bool> SendSuggestionToUser(int userId, string username, string message, string adminName)
        {
            try
            {
                if (!_authService.IsAdmin) return false;

                var data = new
                {
                    userId = userId,
                    username = username,
                    message = message,
                    adminName = adminName,
                    createdAt = DateTime.Now.ToString("yyyy-MM-dd HH:mm:ss")
                };

                var json = JsonSerializer.Serialize(data);
                var content = new StringContent(json, System.Text.Encoding.UTF8, "application/json");

                var response = await _httpClient.PostAsync("/api/Admin/send-suggestion", content);

                return response.IsSuccessStatusCode;
            }
            catch (Exception ex)
            {
                System.Diagnostics.Debug.WriteLine($"Lỗi gửi gợi ý: {ex.Message}");
                return false;
            }
        }

        // ===== LẤY GỢI Ý CHO USER HIỆN TẠI =====
        public async Task<List<AdminSuggestion>> GetSuggestionsForCurrentUserAsync()
        {
            var list = new List<AdminSuggestion>();

            try
            {
                if (!_authService.IsLoggedIn) return list;

                var userId = _authService.CurrentUser.UserId;
                var response = await _httpClient.GetAsync($"/api/Admin/suggestions?userId={userId}");

                if (response.IsSuccessStatusCode)
                {
                    var json = await response.Content.ReadAsStringAsync();
                    var options = new JsonSerializerOptions { PropertyNameCaseInsensitive = true };
                    list = JsonSerializer.Deserialize<List<AdminSuggestion>>(json, options) ?? new();
                }

                return list.OrderByDescending(s => s.CreatedAt).ToList();
            }
            catch (Exception ex)
            {
                System.Diagnostics.Debug.WriteLine($"Lỗi lấy gợi ý: {ex.Message}");
                return list;
            }
        }

        // ===== LẤY DANH SÁCH TẤT CẢ USER (CHO ADMIN) =====
        public async Task<List<UserInfo>> GetAllUsersAsync()
        {
            try
            {
                if (!_authService.IsAdmin) return new();

                var response = await _httpClient.GetAsync("/api/Admin/users");

                if (response.IsSuccessStatusCode)
                {
                    var json = await response.Content.ReadAsStringAsync();
                    var options = new JsonSerializerOptions { PropertyNameCaseInsensitive = true };
                    return JsonSerializer.Deserialize<List<UserInfo>>(json, options) ?? new();
                }

                return new();
            }
            catch (Exception ex)
            {
                System.Diagnostics.Debug.WriteLine($"Lỗi lấy danh sách user: {ex.Message}");
                return new();
            }
        }

        // ===== LẤY THỐNG KÊ HỆ THỐNG (CHO ADMIN) =====
        public async Task<AdminStats> GetAdminStatsAsync()
        {
            try
            {
                if (!_authService.IsAdmin) return null;

                var response = await _httpClient.GetAsync("/api/Admin/stats");

                if (response.IsSuccessStatusCode)
                {
                    var json = await response.Content.ReadAsStringAsync();
                    var options = new JsonSerializerOptions { PropertyNameCaseInsensitive = true };
                    return JsonSerializer.Deserialize<AdminStats>(json, options);
                }

                return null;
            }
            catch (Exception ex)
            {
                System.Diagnostics.Debug.WriteLine($"Lỗi lấy thống kê: {ex.Message}");
                return null;
            }
        }

        public void Dispose()
        {
            _httpClient?.Dispose();
        }

        // ===== RESPONSE CLASSES =====
        private class HealthDataResponse
        {
            public int userId { get; set; }
            public float temp { get; set; }
            public int hr { get; set; }
            public int spo2 { get; set; }
            public string time { get; set; } = string.Empty;
        }

        private class HistoryResponse
        {
            public int userId { get; set; }
            public int total { get; set; }
            public List<HistoryItem> data { get; set; } = new();
        }

        private class HistoryItem
        {
            public int id { get; set; }
            public float temp { get; set; }
            public int hr { get; set; }
            public int spo2 { get; set; }
            public string time { get; set; } = string.Empty;
        }
    }
}