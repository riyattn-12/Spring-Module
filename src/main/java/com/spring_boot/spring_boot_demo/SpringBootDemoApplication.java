package com.spring_boot.spring_boot_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;

@SpringBootApplication

public class SpringBootDemoApplication {

	public static void main(String[] args)
	{

		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

}
