package com.example.basic.service;

import com.example.basic.entity.Release;
import com.example.basic.repository.ReleaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReleaseServiceImpl implements ReleaseService{
  @Autowired
  private ReleaseRepository releaseRepository;

  @Override
  public Iterable<Release> listReleases() {
    return releaseRepository.findAll();
  }

}
