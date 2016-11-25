package com.lethallima.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class SpringBootMicroServiceApplication {

	public static void main(String[] args) {
		System.out.println("Jello, world!");
		SpringApplication.run(SpringBootMicroServiceApplication.class, args);
	}
}
