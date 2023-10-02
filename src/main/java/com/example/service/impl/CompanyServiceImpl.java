package com.example.service.impl;

import com.example.entity.Company;
import com.example.repository.CompanyRepository;
import com.example.service.CompanyService;
import com.example.service.response.PageableResponse;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public Company addCompany(Company company) {
        return null;
    }

    @Override
    public Company findCompanyById(Integer id) {
        return null;
    }

    @Override
    public boolean removeCompanyById(Integer id) {
        return false;
    }

    @Override
    public PageableResponse<Company> getCompanies(Integer pageSize, Integer page) {
        return null;
    }

    @Override
    public Company updateCompanyById(Integer company) {
        return null;
    }

}
