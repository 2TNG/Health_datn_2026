using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace HealthDataAPI2.Models
{
    [Table("Users")]
    public class User
    {
        [Key]
        public int UserId { get; set; }  // ⭐ CHỈ 1 LẦN DUY NHẤT

        [Required]
        [MaxLength(50)]
        public string Username { get; set; } = string.Empty;

        [Required]
        [MaxLength(255)]
        public string UserPassword { get; set; } = string.Empty;
    }
}