using Firebase.Database;
using Firebase.Database.Query;
using HealthMonitorApp1.Models;

namespace HealthMonitorApp1.Services
{
    public class AuthService
    {
        private FirebaseClient firebase;
        private const string FirebaseUrl = "https://baochay-8ae78-default-rtdb.firebaseio.com/";
        private User _currentUser;

        public AuthService()
        {
            firebase = new FirebaseClient(FirebaseUrl);
        }

        public User CurrentUser => _currentUser;
        public bool IsLoggedIn => _currentUser != null;
        public bool IsAdmin => _currentUser != null && _currentUser.Role == "admin";

        // Đăng ký tài khoản mới
        public async Task<(bool success, string message)> RegisterAsync(string username, string password)
        {
            try
            {
                var existingUser = await firebase
                    .Child("users")
                    .OrderBy("Username")
                    .EqualTo(username)
                    .OnceAsync<User>();

                if (existingUser.Any())
                {
                    return (false, "Tên đăng nhập đã tồn tại");
                }

                if (string.IsNullOrWhiteSpace(username) || username.Length < 3)
                {
                    return (false, "Tên đăng nhập phải có ít nhất 3 ký tự");
                }

                if (string.IsNullOrWhiteSpace(password) || password.Length < 4)
                {
                    return (false, "Mật khẩu phải có ít nhất 4 ký tự");
                }

                var newUser = new User
                {
                    Id = Guid.NewGuid().ToString(),
                    Username = username,
                    Password = password,
                    Role = "user",
                    CreatedAt = DateTime.Now,
                    LastLogin = DateTime.Now,
                    IsActive = true
                };

                await firebase
                    .Child("users")
                    .Child(newUser.Id)
                    .PutAsync(newUser);

                return (true, "Đăng ký thành công! Vui lòng đăng nhập.");
            }
            catch (Exception ex)
            {
                return (false, $"Lỗi: {ex.Message}");
            }
        }

        // Đăng nhập - Chỉ cho phép 1 user active
        public async Task<(bool success, string message, User user)> LoginAsync(string username, string password)
        {
            try
            {
                var users = await firebase
                    .Child("users")
                    .OrderBy("Username")
                    .EqualTo(username)
                    .OnceAsync<User>();

                var user = users.FirstOrDefault()?.Object;

                if (user == null)
                {
                    return (false, "Tên đăng nhập không tồn tại", null);
                }

                if (user.Password != password)
                {
                    return (false, "Mật khẩu không đúng", null);
                }

                if (!user.IsActive)
                {
                    return (false, "Tài khoản đã bị khóa", null);
                }

                // 🔥 Vô hiệu hóa tất cả session khác trước khi đăng nhập
                await DeactivateAllSessions();

                // Cập nhật LastLogin
                user.LastLogin = DateTime.Now;
                await firebase
                    .Child("users")
                    .Child(user.Id)
                    .PatchAsync(new { LastLogin = user.LastLogin });

                // Tạo session mới cho user hiện tại
                await StartUserSession(user.Id);

                _currentUser = user;

                string roleText = user.IsAdmin ? " (Quản trị viên)" : "";
                return (true, $"Chào mừng {user.Username}{roleText}!", user);
            }
            catch (Exception ex)
            {
                return (false, $"Lỗi: {ex.Message}", null);
            }
        }

        // Vô hiệu hóa tất cả session
        private async Task DeactivateAllSessions()
        {
            try
            {
                var allSessions = await firebase
                    .Child("user_sessions")
                    .OnceAsync<UserSession>();

                foreach (var session in allSessions)
                {
                    await firebase
                        .Child("user_sessions")
                        .Child(session.Key)
                        .PatchAsync(new
                        {
                            isActive = false,
                            sessionEnd = DateTime.Now.ToString("yyyy-MM-dd HH:mm:ss")
                        });
                }
                System.Diagnostics.Debug.WriteLine("Đã vô hiệu hóa tất cả session cũ");
            }
            catch (Exception ex)
            {
                System.Diagnostics.Debug.WriteLine($"Lỗi vô hiệu hóa session: {ex.Message}");
            }
        }

        // Bắt đầu session cho user
        private async Task StartUserSession(string userId)
        {
            try
            {
                var session = new
                {
                    isActive = true,
                    sessionStart = DateTime.Now.ToString("yyyy-MM-dd HH:mm:ss"), // Format chuẩn
                    sessionEnd = (string)null,
                    userId = userId
                };

                await firebase
                    .Child("user_sessions")
                    .Child(userId)
                    .PutAsync(session);

                System.Diagnostics.Debug.WriteLine($"Đã tạo session cho user {userId} lúc {session.sessionStart}");
            }
            catch (Exception ex)
            {
                System.Diagnostics.Debug.WriteLine($"Lỗi tạo session: {ex.Message}");
            }
        }

        // Kiểm tra user hiện tại có còn active không
        public async Task<bool> IsCurrentUserActive()
        {
            if (_currentUser == null) return false;

            try
            {
                var session = await firebase
                    .Child("user_sessions")
                    .Child(_currentUser.Id)
                    .OnceSingleAsync<UserSession>();

                return session != null && session.isActive;
            }
            catch
            {
                return false;
            }
        }

        // Đăng xuất
        public async void Logout()
        {
            if (_currentUser != null)
            {
                await firebase
                    .Child("user_sessions")
                    .Child(_currentUser.Id)
                    .PatchAsync(new
                    {
                        isActive = false,
                        sessionEnd = DateTime.Now.ToString("yyyy-MM-dd HH:mm:ss")
                    });
            }
            _currentUser = null;
        }

        // Lấy tất cả users (cho Admin)
        // Lấy tất cả users (cho Admin)
        public async Task<List<User>> GetAllUsersAsync()
        {
            try
            {
                var users = await firebase
                    .Child("users")
                    .OnceAsync<User>();

                return users.Select(u => u.Object).ToList();
            }
            catch (Exception ex)
            {
                System.Diagnostics.Debug.WriteLine($"Lỗi lấy danh sách user: {ex.Message}");
                return new List<User>();
            }
        }

        private class UserSession
        {
            public bool isActive { get; set; }
            public string sessionStart { get; set; }
            public string sessionEnd { get; set; }
            public string userId { get; set; }
        }

        // Tạo tài khoản admin mặc định nếu chưa có
        public async Task CreateDefaultAdminIfNotExists()
        {
            try
            {
                // Lấy tất cả users để kiểm tra
                var users = await GetAllUsersAsync();

                var adminExists = users.Any(u => u.Role == "admin");

                if (!adminExists)
                {
                    var admin = new User
                    {
                        Id = Guid.NewGuid().ToString(),
                        Username = "admin",
                        Password = "admin123", // Nên mã hóa trong thực tế
                        Role = "admin",
                        CreatedAt = DateTime.Now,
                        LastLogin = DateTime.Now,
                        IsActive = true
                    };

                    await firebase
                        .Child("users")
                        .Child(admin.Id)
                        .PutAsync(admin);

                    System.Diagnostics.Debug.WriteLine("✅ Đã tạo tài khoản admin mặc định: admin / admin123");
                }
                else
                {
                    System.Diagnostics.Debug.WriteLine("✅ Tài khoản admin đã tồn tại");
                }
            }
            catch (Exception ex)
            {
                System.Diagnostics.Debug.WriteLine($"❌ Lỗi tạo admin: {ex.Message}");
            }
        }
        
    }
}