using System;
using System.Collections.Generic;
using Microsoft.EntityFrameworkCore;

namespace HealthDataAPI2.Models;

public partial class Db48627Context : DbContext
{
    public Db48627Context()
    {
    }

    public Db48627Context(DbContextOptions<Db48627Context> options)
        : base(options)
    {
    }

    public virtual DbSet<HealthReading> HealthReadings { get; set; }

    public virtual DbSet<User> Users { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
#warning To protect potentially sensitive information in your connection string, you should move it out of source code. You can avoid scaffolding the connection string by using the Name= syntax to read it from configuration - see https://go.microsoft.com/fwlink/?linkid=2131148. For more guidance on storing connection strings, see https://go.microsoft.com/fwlink/?LinkId=723263.
        => optionsBuilder.UseSqlServer("Data Source=db48627.public.databaseasp.net;Initial Catalog=db48627;Persist Security Info=True;User ID=db48627;Password=6Fz+Jq@3w!4E;Trust Server Certificate=True");

    protected override void OnModelCreating(ModelBuilder modelBuilder)
    {
        modelBuilder.Entity<HealthReading>(entity =>
        {
            entity.HasKey(e => e.Id).HasName("PK__HealthRe__3214EC07C909FB2A");

            entity.HasIndex(e => e.Timestamp, "IX_Timestamp").IsDescending();
        });

        modelBuilder.Entity<User>(entity =>
        {
            entity.HasKey(e => e.UserId).HasName("PK__Users__1788CC4CE81EB651");

            entity.HasIndex(e => e.Username, "UQ__Users__536C85E40CA2BE8D").IsUnique();

            entity.Property(e => e.UserPassword).HasMaxLength(255);
            entity.Property(e => e.Username).HasMaxLength(50);
        });

        OnModelCreatingPartial(modelBuilder);
    }

    partial void OnModelCreatingPartial(ModelBuilder modelBuilder);
}
