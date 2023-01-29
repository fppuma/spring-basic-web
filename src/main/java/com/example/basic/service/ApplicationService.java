package com.example.basic.service;

import com.example.basic.entity.Application;

public interface ApplicationService {
  Iterable<Application> listApplications();
  Application findApplication(Long id);
}
