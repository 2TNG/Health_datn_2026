using HealthMonitorApp1.Models;
using HealthMonitorApp1.Services;
using System.Collections.ObjectModel;

namespace HealthMonitorApp1.Views
{
    public partial class AdminDashboardPage : ContentPage
    {
        private HealthApiService _firebaseService;
        private AuthService _authService;
        private List<User> _allUsers;
        private User _selectedUser;

        public AdminDashboardPage(AuthService authService, HealthApiService firebaseService)
        {
            InitializeComponent();
            _authService = authService;
            _firebaseService = firebaseService;
            LoadData();
        }

        private async void LoadData()
        {
            try
            {
                // Lấy danh sách users
                _allUsers = await _authService.GetAllUsersAsync();
                UsersCollectionView.ItemsSource = _allUsers;

                // Cập nhật thống kê
                StatsLabel.Text = $"Tổng số người dùng: {_allUsers.Count}";
            }
            catch (Exception ex)
            {
                await DisplayAlert("Lỗi", $"Không thể tải dữ liệu: {ex.Message}", "OK");
            }
        }

        private async void SendSuggestionButton_Clicked(object sender, EventArgs e)
        {
            if (_selectedUser == null)
            {
                await DisplayAlert("Lỗi", "Vui lòng chọn người dùng trước", "OK");
                return;
            }

            var message = SuggestionEntry?.Text?.Trim();
            if (string.IsNullOrEmpty(message))
            {
                await DisplayAlert("Lỗi", "Vui lòng nhập nội dung gợi ý", "OK");
                return;
            }

            var adminName = _authService.CurrentUser?.Username ?? "Admin";

            // 🔥 Nhận kết quả trả về
            var success = await _firebaseService.SendSuggestionToUser(_selectedUser.Id, _selectedUser.Username, message, adminName);

            if (success)
            {
                await DisplayAlert("Thành công", $"Đã gửi gợi ý đến {_selectedUser.Username}", "OK");
                SuggestionEntry.Text = string.Empty;
            }
            else
            {
                await DisplayAlert("Lỗi", "Không thể gửi gợi ý, vui lòng thử lại", "OK");
            }
        }

        private async void UserSelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            if (e.CurrentSelection.FirstOrDefault() is User selectedUser)
            {
                // 🔥 QUAN TRỌNG: Phải có dòng này
                _selectedUser = selectedUser;  // Gán vào biến toàn cục

                SelectedUserLabel.Text = $"📊 DỮ LIỆU CỦA: {selectedUser.Username}";

                var historyData = await _firebaseService.GetHistoryDataByUserId(selectedUser.Id, 30);

                if (historyData.Count > 0)
                {
                    HistoryCollectionView.ItemsSource = historyData;
                    UserDataFrame.IsVisible = true;
                }
                else
                {
                    await DisplayAlert("Thông báo", $"Người dùng {selectedUser.Username} chưa có dữ liệu đo", "OK");
                    UserDataFrame.IsVisible = false;
                }
                SuggestionFrame.IsVisible = true;

                // Debug kiểm tra
                System.Diagnostics.Debug.WriteLine($"Đã gán _selectedUser = {_selectedUser?.Username}");
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
    }
}