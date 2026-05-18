using HealthMonitorApp1.Services;
using HealthMonitorApp1.Views;
using Microsoft.Extensions.DependencyInjection;

namespace HealthMonitorApp1
{
    public partial class App : Application
    {
        public static IServiceProvider Services { get; private set; }

        public App()
        {
            InitializeComponent();

            // Tạo ServiceProvider
            var services = new ServiceCollection();
            services.AddSingleton<AuthService>();
            services.AddSingleton<HealthApiService>();
            services.AddTransient<LoginPage>();
            services.AddTransient<RegisterPage>();
            services.AddTransient<MainPage>();
            services.AddTransient<HistoryPage>();
            services.AddTransient<AdminDashboardPage>();

            Services = services.BuildServiceProvider();

            // Khởi tạo với màn hình đăng nhập
            MainPage = new NavigationPage(new LoginPage());
            Task.Run(async () =>
            {
                try
                {
                    var authService = Services.GetRequiredService<AuthService>();
                    await authService.CreateDefaultAdminIfNotExists();
                    System.Diagnostics.Debug.WriteLine("Đã kiểm tra và tạo admin nếu cần");
                }
                catch (Exception ex)
                {
                    System.Diagnostics.Debug.WriteLine($"Lỗi tạo admin: {ex.Message}");
                }
            });

        }
    }
}