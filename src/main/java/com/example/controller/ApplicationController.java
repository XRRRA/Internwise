package com.example.controller;

import com.example.entities.Application;
import com.example.service.ApplicationService;
import com.example.service.response.PageableResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/applications")
public class ApplicationController {
    private final ApplicationService applicationService;

    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }
    @PostMapping(path="/addAplication")
    public Application addApplication(Application application) {
        return applicationService.addApplication(application);
    }
    @GetMapping(path="/findApplicationById")
    public Application findApplicationById(Integer id){
        return applicationService.findApplicationById(id);
    }
    @DeleteMapping(path="/removeApplicationById")
    public boolean removeApplicationById(Integer id){
        return applicationService.removeApplicationById(id);
    }
    @GetMapping(path="/getApplications")
    public PageableResponse<Application> getApplications(Integer pageSize, Integer page){
        return applicationService.getApplications(pageSize, page);
    }
    @PutMapping(path="/updateApplication")
    public Application updateApplication(Application application){
        return applicationService.updateApplication(application);
    }
}
