package com.example.spring_jpql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// @EntityScan("com.example.spring_jpql.entity")
// @ComponentScan("com.example.spring_jpql.controller, com.example.spring_jpql.service")
// @EnableJpaRepositories("com.example.spring_jpql.repository")
@SpringBootApplication
public class SpringJpqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpqlApplication.class, args);

		System.out.println();
		System.out.println("Server started at http://localhost:8080");
	}

}
