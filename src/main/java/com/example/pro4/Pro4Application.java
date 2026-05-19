package com.example.pro4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Pro4Application {

	public static void main(String[] args) {
		SpringApplication.run(Pro4Application.class, args);
	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello from Kubernetes!";
	}
}