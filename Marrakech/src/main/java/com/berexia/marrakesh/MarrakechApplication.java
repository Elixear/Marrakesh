package com.berexia.marrakesh;

import org.springframework.boot.SpringApplication;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MarrakechApplication extends SpringBootServletInitializer {
	private int count = 0;
	
	@Value("${counter}")
	private String counterString;
	
	@GetMapping("/")
	public String home() {
		counterString = counterString + "-|nT nT|";
		return "Hello there: " + counterString;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MarrakechApplication.class, args);
	}
}
