/*
 * Copyright (C) 2018 PT Global Digital Niaga - All Rights Reserved NOTICE: All information
 * contained herein is, and remains the property of PT Global Digital Niaga. Dissemination of this
 * information or reproduction of this material is strictly forbidden.
 */

package com.coviam.codiecon.mongo.backend.configuration.swaggerConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by Vishal B on Oct, 2018
 */

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2).select()
        .apis(RequestHandlerSelectors.basePackage("com.coviam.codiecon.mongo.backend.api.web"))
        .paths(PathSelectors.any()).build()
        .genericModelSubstitutes(DeferredResult.class, ResponseEntity.class);
  }
}
