using System;
using Dot_Net_Tutorial.Models;

namespace Dot_Net_Tutorial.Services
{
    public interface ICompanyService
    {
        Task<IEnumerable<Company?>> GetAllCompanies();
        Task<Company?> GetCompanyById(int id);
        Task<Company?> CreateCompany(Company company);
        Task<Company?> UpdateCompany(int id, Company company);
        Task DeleteCompany(int id);
    }
}

