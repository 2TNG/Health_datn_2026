using HealthMonitorApp1.Services;

namespace HealthMonitorApp1.Views
{
    public partial class RegisterPage : ContentPage
    {
        private AuthService _authService;

        public RegisterPage()
        {
            InitializeComponent();
            _authService = new AuthService();
        }

        private async void RegisterButton_Clicked(object sender, EventArgs e)
        {
            var username = UsernameEntry?.Text?.Trim();
            var password = PasswordEntry?.Text;
            var confirmPassword = ConfirmPasswordEntry?.Text;

            // Validate input
            if (string.IsNullOrEmpty(username))
            {
                await ShowError("Vui lòng nhập tên đăng nhập");
                return;
            }

            if (username.Length < 3)
            {
                await ShowError("Tên đăng nhập phải có ít nhất 3 ký tự");
                return;
            }

            if (string.IsNullOrEmpty(password))
            {
                await ShowError("Vui lòng nhập mật khẩu");
                return;
            }

            if (password.Length < 4)
            {
                await ShowError("Mật khẩu phải có ít nhất 4 ký tự");
                return;
            }

            if (password != confirmPassword)
            {
                await ShowError("Mật khẩu xác nhận không khớp");
                return;
            }

            // Show loading
            SetLoading(true);

            try
            {
                var (success, message) = await _authService.RegisterAsync(username, password);

                if (success)
                {
                    await DisplayAlert("Thành công", message, "OK");
                    await Navigation.PopAsync(); // Quay lại màn hình đăng nhập
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

        private async void BackToLogin_Tapped(object sender, EventArgs e)
        {
            await Navigation.PopAsync();
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
            RegisterButton.IsEnabled = !isLoading;
            LoadingIndicator.IsVisible = isLoading;
            UsernameEntry.IsEnabled = !isLoading;
            PasswordEntry.IsEnabled = !isLoading;
            ConfirmPasswordEntry.IsEnabled = !isLoading;
        }
    }
}