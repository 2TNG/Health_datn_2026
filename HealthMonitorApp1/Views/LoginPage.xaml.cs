using HealthMonitorApp1.Services;
using Microsoft.Extensions.DependencyInjection;

namespace HealthMonitorApp1.Views
{
    public partial class LoginPage : ContentPage
    {
        private AuthService _authService;

        public LoginPage()
        {
            InitializeComponent();
            _authService = new AuthService();

            // Kiểm tra nếu đã đăng nhập thì chuyển thẳng vào MainPage
            if (_authService.IsLoggedIn)
            {
                NavigateToMainPage();
            }
        }

        private async void LoginButton_Clicked(object sender, EventArgs e)
        {
            var username = UsernameEntry?.Text?.Trim();
            var password = PasswordEntry?.Text;

            // Validate input
            if (string.IsNullOrEmpty(username))
            {
                await ShowError("Vui lòng nhập tên đăng nhập");
                return;
            }

            if (string.IsNullOrEmpty(password))
            {
                await ShowError("Vui lòng nhập mật khẩu");
                return;
            }

            // Show loading
            SetLoading(true);

            try
            {
                var (success, message, user) = await _authService.LoginAsync(username, password);

                if (success)
                {
                    await DisplayAlert("Thành công", message, "OK");
                    NavigateToMainPage();
                }
                else
                {
                    await ShowError(message);
                }
            }
            catch (Exception ex)
            {
                await ShowError($"Lỗi: {ex.Message}");
            }
            finally
            {
                SetLoading(false);
            }
        }

        private async void RegisterLink_Tapped(object sender, EventArgs e)
        {
            await Navigation.PushAsync(new RegisterPage());
        }

        private void NavigateToMainPage()
        {
            // Tạo FirebaseService với AuthService đã có
            var firebaseService = new HealthApiService(_authService);

            // Chuyển sang MainPage
            Application.Current.MainPage = new NavigationPage(new MainPage(_authService, firebaseService));
        }

        private async Task ShowError(string message)
        {
            ErrorLabel.Text = message;
            ErrorLabel.IsVisible = true;
            await Task.Delay(3000);
            ErrorLabel.IsVisible = false;
        }

        private void SetLoading(bool isLoading)
        {
            LoginButton.IsEnabled = !isLoading;
            LoadingIndicator.IsVisible = isLoading;
            UsernameEntry.IsEnabled = !isLoading;
            PasswordEntry.IsEnabled = !isLoading;
        }
    }
}