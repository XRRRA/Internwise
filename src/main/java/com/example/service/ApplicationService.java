package com.example.service;

import com.example.entity.Application;
import com.example.service.response.PageableResponse;

public interface ApplicationService {
    Application addApplication(Application application);
    Application findApplicationById(Integer id);
    boolean removeApplicationById(Integer id);
    PageableResponse<Application> getApplications(Integer pageSize, Integer page);
    Application updateApplication(Application application);
}
