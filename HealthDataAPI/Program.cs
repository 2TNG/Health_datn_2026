using HealthDataAPI2.Data;
using Microsoft.EntityFrameworkCore;
using Scalar.AspNetCore;

var builder = WebApplication.CreateBuilder(args);

// Add services to the container.
builder.Services.AddControllers();
builder.Services.AddOpenApi();

// CORS - Cho phép MAUI app và ESP32 gọi
builder.Services.AddCors(options =>
{
    options.AddPolicy("AllowAll", policy =>
    {
        policy.AllowAnyOrigin()
              .AllowAnyMethod()
              .AllowAnyHeader();
    });
});

// Kết nối SQL Server
builder.Services.AddDbContext<AppDbContext>(options =>
    options.UseSqlServer(builder.Configuration.GetConnectionString("DefaultConnection")));

var app = builder.Build();

// ✅ QUAN TRỌNG: Sửa để Scalar chạy trên mọi môi trường (kể cả Production)
// MonsterASP chạy ở Production mode, không phải Development
app.MapOpenApi();
app.MapScalarApiReference();    // Luôn chạy Scalar UI

// Thêm endpoint mặc định để test API có hoạt động không
app.MapGet("/", () => Results.Json(new
{
    message = "HealthDataAPI2 is running!",
    scalar_ui = "/scalar/v1",
    endpoints = new[] { "/api/...", "/openapi/v1.json" }
}));

app.UseHttpsRedirection();
app.UseCors("AllowAll");
app.UseAuthorization();
app.MapControllers();

// Tạo database nếu chưa có
using (var scope = app.Services.CreateScope())
{
    var dbContext = scope.ServiceProvider.GetRequiredService<AppDbContext>();
    dbContext.Database.EnsureCreated();
}

app.Run();