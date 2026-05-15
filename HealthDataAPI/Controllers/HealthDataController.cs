using HealthDataAPI2.Data;
using HealthDataAPI2.Models;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;

namespace HealthDataAPI2.Controllers
{
    [ApiController]
    [Route("api/[controller]")]
    public class HealthDataController : ControllerBase
    {
        private readonly Db48627Context _dbContext;
        private readonly ILogger<HealthDataController> _logger;

        public HealthDataController(Db48627Context dbContext, ILogger<HealthDataController> logger)
        {
            _dbContext = dbContext;
            _logger = logger;
        }

        // ===== ESP32 GỬI DỮ LIỆU LÊN (CÓ USER ID) =====
        [HttpPost("send")]
        public async Task<IActionResult> ReceiveData([FromBody] HealthDataDto data)
        {
            try
            {
                // Kiểm tra UserId có tồn tại không
                var userExists = await _dbContext.Users.AnyAsync(u => u.UserId == data.userId);
                if (!userExists)
                {
                    return BadRequest(new { error = "Invalid UserId. User does not exist." });
                }

                // Tạo bản ghi mới
                var healthData = new HealthData
                {
                    UserId = data.userId,  // ⭐ Gán UserId
                    Temperature = data.temperature,
                    HeartRate = data.hr,
                    SpO2 = data.spo2,
                    Timestamp = string.IsNullOrEmpty(data.time) ? DateTime.Now : DateTime.Parse(data.time)
                };

                _dbContext.HealthReadings.Add(healthData);
                await _dbContext.SaveChangesAsync();

                _logger.LogInformation("Data saved for UserId: {UserId}, Temp: {Temp}, HR: {HR}, SpO2: {SpO2}",
                    data.userId, data.temperature, data.hr, data.spo2);

                return Ok(new
                {
                    success = true,
                    message = "Data saved successfully",
                    id = healthData.Id
                });
            }
            catch (Exception ex)
            {
                _logger.LogError(ex, "Error saving data");
                return StatusCode(500, new { error = ex.Message });
            }
        }

        // ===== LẤY DỮ LIỆU MỚI NHẤT CỦA 1 USER =====
        [HttpGet("latest")]
        public async Task<IActionResult> GetLatest([FromQuery] int userId)
        {
            // Kiểm tra userId
            if (userId <= 0)
            {
                return BadRequest(new { message = "Invalid UserId" });
            }

            var latest = await _dbContext.HealthReadings
                .Where(x => x.UserId == userId)  // ⭐ Lọc theo UserId
                .OrderByDescending(x => x.Timestamp)
                .FirstOrDefaultAsync();

            if (latest == null)
                return NotFound(new { message = $"No data found for UserId {userId}" });

            return Ok(new
            {
                userId = latest.UserId,
                temp = latest.Temperature,
                hr = latest.HeartRate,
                spo2 = latest.SpO2,
                time = latest.Timestamp.ToString("yyyy-MM-dd HH:mm:ss")
            });
        }

        // ===== LẤY LỊCH SỬ DỮ LIỆU CỦA 1 USER =====
        [HttpGet("history")]
        public async Task<IActionResult> GetHistory([FromQuery] int userId, [FromQuery] int limit = 50)
        {
            // Kiểm tra userId
            if (userId <= 0)
            {
                return BadRequest(new { message = "Invalid UserId" });
            }

            var history = await _dbContext.HealthReadings
                .Where(x => x.UserId == userId)  // ⭐ Lọc theo UserId
                .OrderByDescending(x => x.Timestamp)
                .Take(limit)
                .Select(x => new
                {
                    id = x.Id,
                    temp = x.Temperature,
                    hr = x.HeartRate,
                    spo2 = x.SpO2,
                    time = x.Timestamp.ToString("yyyy-MM-dd HH:mm:ss")
                })
                .ToListAsync();

            if (history.Count == 0)
                return NotFound(new { message = $"No history data found for UserId {userId}" });

            return Ok(new
            {
                userId = userId,
                total = history.Count,
                data = history
            });
        }

        // ===== LẤY TẤT CẢ DỮ LIỆU (KHÔNG LỌC USER - CHO ADMIN) =====
        [HttpGet("all")]
        public async Task<IActionResult> GetAll([FromQuery] int limit = 100)
        {
            var allData = await _dbContext.HealthReadings
                .Include(x => x.User)  // Lấy luôn thông tin user
                .OrderByDescending(x => x.Timestamp)
                .Take(limit)
                .Select(x => new
                {
                    id = x.Id,
                    userId = x.UserId,
                    username = x.User != null ? x.User.Username : "Unknown",
                    temp = x.Temperature,
                    hr = x.HeartRate,
                    spo2 = x.SpO2,
                    time = x.Timestamp.ToString("yyyy-MM-dd HH:mm:ss")
                })
                .ToListAsync();

            return Ok(allData);
        }

        // ===== LẤY THỐNG KÊ NHANH CỦA USER =====
        [HttpGet("stats")]
        public async Task<IActionResult> GetStats([FromQuery] int userId)
        {
            if (userId <= 0)
            {
                return BadRequest(new { message = "Invalid UserId" });
            }

            var stats = await _dbContext.HealthReadings
                .Where(x => x.UserId == userId)
                .GroupBy(x => x.UserId)
                .Select(g => new
                {
                    userId = g.Key,
                    totalReadings = g.Count(),
                    avgTemp = g.Average(x => x.Temperature),
                    avgHR = g.Average(x => x.HeartRate),
                    avgSpO2 = g.Average(x => x.SpO2),
                    minTemp = g.Min(x => x.Temperature),
                    maxTemp = g.Max(x => x.Temperature),
                    minHR = g.Min(x => x.HeartRate),
                    maxHR = g.Max(x => x.HeartRate),
                    lastUpdate = g.Max(x => x.Timestamp)
                })
                .FirstOrDefaultAsync();

            if (stats == null)
                return NotFound(new { message = $"No data found for UserId {userId}" });

            return Ok(stats);
        }
    }
}