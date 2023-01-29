package com.example.basic.service;

import com.example.basic.entity.Application;
import com.example.basic.exception.ApplicationNotFoundException;
import com.example.basic.repository.ApplicationRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationServiceImpl implements ApplicationService{
  @Autowired
  private ApplicationRepository applicationRepository;

  @Override
  public Iterable<Application> listApplications() {
    return applicationRepository.findAll();
  }

  @Override
    public Application findApplication(Long id) {
        Optional<Application> optionalApplication = applicationRepository.findById(id);

        if(optionalApplication.isPresent()) {
            return optionalApplication.get();
        } else {
            throw new ApplicationNotFoundException("Application Not Found");
        }
    }


}
