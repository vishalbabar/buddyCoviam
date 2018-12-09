package com.coviam.codiecon.mongo.backend.configuration.service;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Vishal B on Oct, 2018
 */

@EnableAutoConfiguration
@Configuration
public class ServiceConfiguration {

  @Bean
  public Mapper createDozerMapper() {
    return new DozerBeanMapper();
  }
}

