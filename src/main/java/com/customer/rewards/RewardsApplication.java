package com.customer.rewards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping
public class RewardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RewardsApplication.class, args);
	}

	@GetMapping("/")
	public String status(){
		return "Running...";
	}
}
