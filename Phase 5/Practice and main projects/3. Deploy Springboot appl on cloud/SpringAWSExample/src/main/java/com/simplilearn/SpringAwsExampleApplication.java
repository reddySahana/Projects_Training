package com.simplilearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAwsExampleApplication {

	@GetMapping("/")
	public String home() {
		return "Welcome to my First AWS Demo...!!";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringAwsExampleApplication.class, args);
	}

}
