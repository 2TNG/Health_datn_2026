using Microsoft.EntityFrameworkCore;
using HealthDataAPI2.Models;

namespace HealthDataAPI2.Data
{
    public class AppDbContext : DbContext
    {
        public AppDbContext(DbContextOptions<AppDbContext> options) : base(options)
        {
        }

        public DbSet<HealthData> HealthReadings { get; set; }
    }
}