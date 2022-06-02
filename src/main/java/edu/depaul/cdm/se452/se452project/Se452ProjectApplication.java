package edu.depaul.cdm.se452.se452project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ConfigurationPropertiesScan(basePackages = {"edu.depaul.cdm.se452.se452project.configurations"})
@EntityScan(basePackages = {"edu.depaul.cdm.se452.se452project.entities"})
public class Se452ProjectApplication {

	public static final Logger logger = LoggerFactory.getLogger(Se452ProjectApplication.class);

	public static void main(String[] args) {
		logger.info("Start of Se452ProjectApplication");
		SpringApplication.run(Se452ProjectApplication.class, args);
		logger.info("End of Se452ProjectApplication");
	}

	@Bean
	public void helloWorld(){
		System.out.println("Hello World!");
	}
}
