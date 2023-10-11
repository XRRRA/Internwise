package com.example.service.impl;

import com.example.entity.Application;
import com.example.repository.ApplicationRepository;
import com.example.service.ApplicationService;
import com.example.service.response.PageableResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ApplicationServiceImpl implements ApplicationService {
    private final ApplicationRepository applicationRepository;

    public ApplicationServiceImpl(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    @Override
    public Application addApplication(Application application) {
        return applicationRepository.save(application);
    }

    @Override
    public Application findApplicationById(Integer id) {
        Optional<Application> application = applicationRepository.findById(id);
        if(application.isEmpty()){
            System.out.println("Application not found");
        }
        return application.get();
    }

    @Override
    public boolean removeApplicationById(Integer id) {
        applicationRepository.deleteById(id);
        return !applicationRepository.existsById(id);
    }

    @Override
    public PageableResponse<Application> getApplications(Integer pageSize, Integer page) {
        Page<Application> pageApplication = applicationRepository.findAll(PageRequest.of(page, pageSize));
        return new PageableResponse<>(pageApplication.getTotalPages(), pageApplication.getNumberOfElements(), pageApplication.getContent());
    }

    @Override
    public Application updateApplication(Application application) {
        return applicationRepository.save(application);
    }
}
