package com.MyMoviePlan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.MyMoviePlan")

public class MoviePlanApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviePlanApplication.class, args);
	}

}
