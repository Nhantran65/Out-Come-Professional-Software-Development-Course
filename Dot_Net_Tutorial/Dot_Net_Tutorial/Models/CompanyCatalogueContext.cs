using Microsoft.EntityFrameworkCore;
using Microsoft.Extensions.Options;

namespace Dot_Net_Tutorial.Models
{ public class BookingDoctorContext : DbContext
{
    public BookingDoctorContext(DbContextOptions<BookingDoctorContext> options)
        : base(options)
    {
            
            Companies = Set<Company>();
    }

    // DbSet for each object in Database
        
        public DbSet<Company> Companies { get; set; }
} 
}
