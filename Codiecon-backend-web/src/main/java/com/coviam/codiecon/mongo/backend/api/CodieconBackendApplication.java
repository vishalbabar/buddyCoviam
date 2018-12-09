package com.coviam.codiecon.mongo.backend.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.coviam.codiecon.mongo")
@EnableMongoRepositories(basePackages = "com.coviam.codiecon.mongo.backend.repository")
public class CodieconBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodieconBackendApplication.class, args);
	}
}
