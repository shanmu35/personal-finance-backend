package com.example.finance_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinanceBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinanceBackendApplication.class, args);
	}
	@Bean
    CommandLineRunner run(Car car) {
        return args -> {
            car.drive();  
        };
    }

}
