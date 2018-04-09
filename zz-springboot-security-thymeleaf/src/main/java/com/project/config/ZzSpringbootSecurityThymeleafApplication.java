package com.project.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@ComponentScan({"com.project.error", "com.project.controller"})
@Import(SpringSecurityConfig.class)
public class ZzSpringbootSecurityThymeleafApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(ZzSpringbootSecurityThymeleafApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ZzSpringbootSecurityThymeleafApplication.class);
	}
	
}
