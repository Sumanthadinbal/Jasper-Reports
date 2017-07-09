package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.controller.UserController;
import com.example.service.UserService;

@SpringBootApplication
@ComponentScan(basePackageClasses = { UserController.class, UserService.class })
public class JasperApplication {

	public static void main(String[] args) {
		SpringApplication.run(JasperApplication.class, args);
	}
}
