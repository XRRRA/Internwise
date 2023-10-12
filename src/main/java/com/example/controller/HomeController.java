package com.example.controller;

import com.example.entities.Company;
import com.example.entities.Program;
import com.example.entities.User;
import com.example.service.CompanyService;
import com.example.service.ProgramService;
import com.example.service.UserService;
import com.example.service.response.PageableResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class HomeController {

    private final CompanyService companyService;
    private final ProgramService programService;
    private final UserService userService;

    public HomeController(CompanyService companyService, ProgramService programService, UserService userService) {
        this.companyService = companyService;
        this.programService = programService;
        this.userService = userService;
    }

    @GetMapping("/")
    public String getCompanies(Model model) {
        PageableResponse<Company> companies = companyService.getCompanies(10, 0);
        model.addAttribute("listOfCompanies", companies);
        return "home-page";
    }
}
