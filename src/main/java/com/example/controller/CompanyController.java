package com.example.controller;

import com.example.entity.Company;
import com.example.service.CompanyService;
import com.example.service.response.PageableResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/companies")
public class CompanyController {
    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @PostMapping(path="/addCompany")
    public Company addCompany(Company company){
        return companyService.addCompany(company);
    }

    @GetMapping(path="/findCompanyById/{id}")
    public Company findCompanyById(@PathVariable Integer id){
        return companyService.findCompanyById(id);
    }

    @DeleteMapping(path="/removeCompanyById")
    public boolean removeCompanyById(Integer id){
        return companyService.removeCompanyById(id);
    }

    @GetMapping(path="/getCompanies")
    public PageableResponse<Company> getCompanies(Integer pageSize, Integer page){
        return companyService.getCompanies(pageSize, page);
    }

    @PutMapping(path="/updateCompanyById")
    public Company updateCompanyById(Integer id) {
        return companyService.updateCompanyById(id);
    }
}
//finished