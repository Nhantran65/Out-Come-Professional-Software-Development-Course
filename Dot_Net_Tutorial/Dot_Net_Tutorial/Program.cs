using Dot_Net_Tutorial.Models;
using Dot_Net_Tutorial.Repositories;
using Dot_Net_Tutorial.Services;
using Microsoft.EntityFrameworkCore;
using System.Configuration;
using System.Net.NetworkInformation;
using System.Text;
using Microsoft.Extensions.Configuration;

var builder = WebApplication.CreateBuilder(args);

// Add services to the container.
builder.Services.AddControllers();
builder.Services.AddDbContext<BookingDoctorContext>((serviceProvider, options) =>
{
    var settings = serviceProvider.GetRequiredService<IConfiguration>().GetSection("ConnectionStrings");
    options.UseMySql(settings["DefaultConnection"], new MySqlServerVersion(new Version(8, 0, 26)));
});

builder.Services.AddEndpointsApiExplorer();
builder.Services.AddSwaggerGen();

builder.Services.AddScoped<ICompanyRepository, CompanyRepository>();
builder.Services.AddScoped<ICompanyService, CompanyService>();

var app = builder.Build();

// Configure the HTTP request pipeline.
if (app.Environment.IsDevelopment())
{
    app.UseSwagger();
    app.UseSwaggerUI();
}

app.UseHttpsRedirection();

app.UseAuthorization();
app.UseAuthentication();

app.MapControllers();

app.Run();
