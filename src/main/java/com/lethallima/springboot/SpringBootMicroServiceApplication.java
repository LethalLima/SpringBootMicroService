package com.lethallima.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(value = "com.lethallima.springboot.repositories")
@SpringBootApplication
public class SpringBootMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroServiceApplication.class, args);
	}
}
