package com.example.service.impl;

import com.example.entities.Company;
import com.example.repository.CompanyRepository;
import com.example.service.CompanyService;
import com.example.service.response.PageableResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public Company addCompany(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public Company findCompanyById(Integer id) {
        Optional<Company> company = companyRepository.findById(id);
        if (company.isEmpty()) {
            System.out.println("Company not found");
        }
        return company.get();
    }

    @Override
    public boolean removeCompanyById(Integer id) {
        companyRepository.deleteById(id);
        return !companyRepository.existsById(id);
    }

    @Override
    public PageableResponse<Company> getCompanies(Integer pageSize, Integer page) {
        Page<Company> pageCompany = companyRepository.findAll(PageRequest.of(page, pageSize));
        return new PageableResponse<>(pageCompany.getTotalPages(), pageCompany.getNumberOfElements(), pageCompany.getContent());
    }

    @Override
    public Company updateCompany(Company company) {
        return companyRepository.save(company);
    }
}