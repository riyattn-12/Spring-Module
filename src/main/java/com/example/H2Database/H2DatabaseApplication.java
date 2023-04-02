package com.example.H2Database;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class H2DatabaseApplication
{
	private EmployeeRegistory employeeRegistory;
	public static void main(String[] args) {

		SpringApplication.run(H2DatabaseApplication.class, args);
	}




	}

