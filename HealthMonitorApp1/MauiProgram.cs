using HealthMonitorApp1.Services;
using HealthMonitorApp1.Views;
using Microsoft.Extensions.Logging;

namespace HealthMonitorApp1
{
    public static class MauiProgram
    {
        public static MauiApp CreateMauiApp()
        {
            var builder = MauiApp.CreateBuilder();
            builder
                .UseMauiApp<App>()
                .ConfigureFonts(fonts =>
                {
                    fonts.AddFont("OpenSans-Regular.ttf", "OpenSansRegular");
                    fonts.AddFont("OpenSans-Semibold.ttf", "OpenSansSemibold");
                });

            // Đăng ký Services (Singleton để dùng chung)
            builder.Services.AddSingleton<AuthService>();
            builder.Services.AddSingleton<HealthApiService>();

            // Đăng ký Pages (Transient)
            builder.Services.AddTransient<LoginPage>();
            builder.Services.AddTransient<RegisterPage>();
            builder.Services.AddTransient<MainPage>();
            builder.Services.AddTransient<HistoryPage>();
            builder.Services.AddTransient<AdminDashboardPage>();

#if DEBUG
            builder.Logging.AddDebug();
#endif

            return builder.Build();
        }
    }
}