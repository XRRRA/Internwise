package com.example.service;

import com.example.entities.Company;
import com.example.service.response.PageableResponse;

public interface CompanyService {
    Company addCompany(Company company);
    Company findCompanyById(Integer id);
    boolean removeCompanyById(Integer id);
    PageableResponse<Company> getCompanies(Integer pageSize, Integer page);
    Company updateCompany(Company company);
}