package com.example.schooloptima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SchooloptimaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchooloptimaApplication.class, args);
	}
	@GetMapping("/")
public String getMessage() {
	return "Welcome";
}
}
