package com.javaguides.MavenProject;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MavenProjectApplication {

	// Declare a Logger instance
	private static final Logger logger = LoggerFactory.getLogger(MavenProjectApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MavenProjectApplication.class, args);
	}

	@PostConstruct
	public void init() {
		// Use the logger instance to log messages
		logger.info("Java App Started");
	}

	public String getStatus() {
		return "OK";
	}
}
