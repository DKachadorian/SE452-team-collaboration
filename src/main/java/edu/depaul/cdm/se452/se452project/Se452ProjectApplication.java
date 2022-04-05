package edu.depaul.cdm.se452.se452project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Se452ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(Se452ProjectApplication.class, args);
	}

	@Bean
	public void helloWorld(){
		System.out.println("Hello World");
	}

}
