using HealthDataAPI2.Models;
using HealthMonitorApp1.Models;
using System.Text.Json;

namespace HealthMonitorApp1.Services
{
    public class AuthService
    {
        private readonly HttpClient _httpClient;
        private const string BaseUrl = "http://192.168.1.100:5000"; // ⚠️ SỬA IP CỦA WEB API

        private User _currentUser;
        private string _sessionToken;

        public AuthService()
        {
            _httpClient = new HttpClient();
            _httpClient.BaseAddress = new Uri(BaseUrl);
            _httpClient.Timeout = TimeSpan.FromSeconds(30);
            _httpClient.DefaultRequestHeaders.Accept.Add(
                new System.Net.Http.Headers.MediaTypeWithQualityHeaderValue("application/json"));

            // Khôi phục session từ bộ nhớ (nếu có)
            LoadSavedSession();
        }

        public User CurrentUser => _currentUser;
        public bool IsLoggedIn => _currentUser != null;
        public bool IsAdmin => _currentUser != null && _currentUser.Role == "admin";
        public string SessionToken => _sessionToken;

        // ===== ĐĂNG KÝ TÀI KHOẢN MỚI =====
        public async Task<(bool success, string message)> RegisterAsync(string username, string password)
        {
            try
            {
                // Kiểm tra dữ liệu đầu vào
                if (string.IsNullOrWhiteSpace(username) || username.Length < 3)
                {
                    return (false, "Tên đăng nhập phải có ít nhất 3 ký tự");
                }

                if (string.IsNullOrWhiteSpace(password) || password.Length < 4)
                {
                    return (false, "Mật khẩu phải có ít nhất 4 ký tự");
                }

                var data = new
                {
                    username = username,
                    password = password
                };

                var json = JsonSerializer.Serialize(data);
                var content = new StringContent(json, System.Text.Encoding.UTF8, "application/json");

                var response = await _httpClient.PostAsync("/api/Auth/register", content);

                if (response.IsSuccessStatusCode)
                {
                    var responseJson = await response.Content.ReadAsStringAsync();
                    var options = new JsonSerializerOptions { PropertyNameCaseInsensitive = true };
                    var result = JsonSerializer.Deserialize<RegisterResponse>(responseJson, options);

                    if (result != null && result.success)
                    {
                        return (true, result.message ?? "Đăng ký thành công! Vui lòng đăng nhập.");
                    }
                    return (false, result?.message ?? "Đăng ký thất bại");
                }

                var error = await response.Content.ReadAsStringAsync();
                return (false, $"Lỗi: {error}");
            }
            catch (Exception ex)
            {
                return (false, $"Lỗi kết nối: {ex.Message}");
            }
        }

        // ===== ĐĂNG NHẬP =====
        public async Task<(bool success, string message, User user)> LoginAsync(string username, string password)
        {
            try
            {
                var data = new
                {
                    username = username,
                    password = password
                };

                var json = JsonSerializer.Serialize(data);
                var content = new StringContent(json, System.Text.Encoding.UTF8, "application/json");

                var response = await _httpClient.PostAsync("/api/Auth/login", content);

                if (response.IsSuccessStatusCode)
                {
                    var responseJson = await response.Content.ReadAsStringAsync();
                    var options = new JsonSerializerOptions { PropertyNameCaseInsensitive = true };
                    var result = JsonSerializer.Deserialize<LoginResponse>(responseJson, options);

                    if (result != null && result.success)
                    {
                        // Tạo User object
                        _currentUser = new User
                        {
                            UserId = result.userId,
                            Username = result.username,
                            Role = result.role ?? "user",
                            IsActive = true,
                            LastLogin = DateTime.Now
                        };

                        _sessionToken = result.sessionToken ?? Guid.NewGuid().ToString();

                        // Lưu session
                        SaveSession();

                        string roleText = _currentUser.IsAdmin ? " (Quản trị viên)" : "";
                        return (true, $"Chào mừng {_currentUser.Username}{roleText}!", _currentUser);
                    }

                    return (false, result?.message ?? "Đăng nhập thất bại", null);
                }

                var error = await response.Content.ReadAsStringAsync();
                return (false, $"Sai tên đăng nhập hoặc mật khẩu", null);
            }
            catch (Exception ex)
            {
                return (false, $"Lỗi kết nối: {ex.Message}", null);
            }
        }

        // ===== KIỂM TRA USER HIỆN TẠI CÓ CÒN ACTIVE KHÔNG =====
        public async Task<bool> IsCurrentUserActive()
        {
            if (_currentUser == null || string.IsNullOrEmpty(_sessionToken)) return false;

            try
            {
                _httpClient.DefaultRequestHeaders.Remove("SessionToken");
                _httpClient.DefaultRequestHeaders.Add("SessionToken", _sessionToken);

                var response = await _httpClient.GetAsync($"/api/Auth/validate-session");

                if (response.IsSuccessStatusCode)
                {
                    var responseJson = await response.Content.ReadAsStringAsync();
                    var options = new JsonSerializerOptions { PropertyNameCaseInsensitive = true };
                    var result = JsonSerializer.Deserialize<ValidateSessionResponse>(responseJson, options);

                    return result?.isValid ?? false;
                }

                return false;
            }
            catch (Exception ex)
            {
                System.Diagnostics.Debug.WriteLine($"Lỗi kiểm tra session: {ex.Message}");
                return false;
            }
            finally
            {
                _httpClient.DefaultRequestHeaders.Remove("SessionToken");
            }
        }

        // ===== ĐĂNG XUẤT =====
        public async void Logout()
        {
            if (!string.IsNullOrEmpty(_sessionToken))
            {
                try
                {
                    _httpClient.DefaultRequestHeaders.Remove("SessionToken");
                    _httpClient.DefaultRequestHeaders.Add("SessionToken", _sessionToken);

                    await _httpClient.PostAsync("/api/Auth/logout", null);
                }
                catch (Exception ex)
                {
                    System.Diagnostics.Debug.WriteLine($"Lỗi đăng xuất: {ex.Message}");
                }
                finally
                {
                    _httpClient.DefaultRequestHeaders.Remove("SessionToken");
                }
            }

            _currentUser = null;
            _sessionToken = null;
            ClearSavedSession();
        }

        // ===== LẤY TẤT CẢ USERS (CHO ADMIN) =====
        public async Task<List<User>> GetAllUsersAsync()
        {
            try
            {
                if (!IsAdmin) return new List<User>();

                _httpClient.DefaultRequestHeaders.Remove("SessionToken");
                _httpClient.DefaultRequestHeaders.Add("SessionToken", _sessionToken);

                var response = await _httpClient.GetAsync("/api/Admin/users");

                if (response.IsSuccessStatusCode)
                {
                    var json = await response.Content.ReadAsStringAsync();
                    var options = new JsonSerializerOptions { PropertyNameCaseInsensitive = true };
                    var users = JsonSerializer.Deserialize<List<UserDto>>(json, options);

                    return users?.Select(u => new User
                    {
                        UserId = u.userId,
                        Username = u.username,
                        Role = u.role ?? "user",
                        IsActive = true
                    }).ToList() ?? new List<User>();
                }

                return new List<User>();
            }
            catch (Exception ex)
            {
                System.Diagnostics.Debug.WriteLine($"Lỗi lấy danh sách user: {ex.Message}");
                return new List<User>();
            }
            finally
            {
                _httpClient.DefaultRequestHeaders.Remove("SessionToken");
            }
        }

        // ===== LẤY THÔNG TIN USER THEO ID =====
        public async Task<User> GetUserByIdAsync(int userId)
        {
            try
            {
                if (!IsAdmin) return null;

                _httpClient.DefaultRequestHeaders.Remove("SessionToken");
                _httpClient.DefaultRequestHeaders.Add("SessionToken", _sessionToken);

                var response = await _httpClient.GetAsync($"/api/Admin/users/{userId}");

                if (response.IsSuccessStatusCode)
                {
                    var json = await response.Content.ReadAsStringAsync();
                    var options = new JsonSerializerOptions { PropertyNameCaseInsensitive = true };
                    var userDto = JsonSerializer.Deserialize<UserDto>(json, options);

                    if (userDto != null)
                    {
                        return new User
                        {
                            UserId = userDto.userId,
                            Username = userDto.username,
                            Role = userDto.role ?? "user",
                            IsActive = true
                        };
                    }
                }

                return null;
            }
            catch (Exception ex)
            {
                System.Diagnostics.Debug.WriteLine($"Lỗi lấy user: {ex.Message}");
                return null;
            }
            finally
            {
                _httpClient.DefaultRequestHeaders.Remove("SessionToken");
            }
        }

        // ===== TẠO ADMIN MẶC ĐỊNH (CHỈ GỌI KHI CẦN) =====
        public async Task CreateDefaultAdminIfNotExists()
        {
            try
            {
                var response = await _httpClient.PostAsync("/api/Auth/create-default-admin", null);

                if (response.IsSuccessStatusCode)
                {
                    System.Diagnostics.Debug.WriteLine("✅ Đã tạo/tồn tại tài khoản admin mặc định");
                }
                else
                {
                    System.Diagnostics.Debug.WriteLine("⚠️ Không thể tạo admin mặc định");
                }
            }
            catch (Exception ex)
            {
                System.Diagnostics.Debug.WriteLine($"❌ Lỗi tạo admin: {ex.Message}");
            }
        }

        // ===== LƯU SESSION =====
        private void SaveSession()
        {
            if (_currentUser != null && !string.IsNullOrEmpty(_sessionToken))
            {
                Preferences.Set("session_token", _sessionToken);
                Preferences.Set("user_id", _currentUser.UserId);
                Preferences.Set("username", _currentUser.Username);
                Preferences.Set("user_role", _currentUser.Role);
            }
        }

        // ===== KHÔI PHỤC SESSION =====
        private async void LoadSavedSession()
        {
            var token = Preferences.Get("session_token", string.Empty);
            var userId = Preferences.Get("user_id", 0);
            var username = Preferences.Get("username", string.Empty);
            var role = Preferences.Get("user_role", "user");

            if (!string.IsNullOrEmpty(token) && userId > 0)
            {
                _sessionToken = token;

                // Kiểm tra session còn hiệu lực không
                _httpClient.DefaultRequestHeaders.Remove("SessionToken");
                _httpClient.DefaultRequestHeaders.Add("SessionToken", _sessionToken);

                try
                {
                    var response = await _httpClient.GetAsync("/api/Auth/validate-session");
                    if (response.IsSuccessStatusCode)
                    {
                        _currentUser = new User
                        {
                            UserId = userId,
                            Username = username,
                            Role = role,
                            IsActive = true
                        };
                        System.Diagnostics.Debug.WriteLine($"✅ Đã khôi phục session cho user: {username}");
                    }
                    else
                    {
                        ClearSavedSession();
                    }
                }
                catch
                {
                    ClearSavedSession();
                }
                finally
                {
                    _httpClient.DefaultRequestHeaders.Remove("SessionToken");
                }
            }
        }

        // ===== XÓA SESSION ĐÃ LƯU =====
        private void ClearSavedSession()
        {
            Preferences.Remove("session_token");
            Preferences.Remove("user_id");
            Preferences.Remove("username");
            Preferences.Remove("user_role");
            _sessionToken = null;
        }

        // ===== RESPONSE CLASSES =====
        private class LoginResponse
        {
            public bool success { get; set; }
            public int userId { get; set; }
            public string username { get; set; } = string.Empty;
            public string role { get; set; } = string.Empty;
            public string sessionToken { get; set; } = string.Empty;
            public string message { get; set; } = string.Empty;
        }

        private class RegisterResponse
        {
            public bool success { get; set; }
            public string message { get; set; } = string.Empty;
        }

        private class ValidateSessionResponse
        {
            public bool isValid { get; set; }
            public int userId { get; set; }
        }

        private class UserDto
        {
            public int userId { get; set; }
            public string username { get; set; } = string.Empty;
            public string role { get; set; } = string.Empty;
        }
    }
}