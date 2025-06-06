package com.practice.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String getHello() {
		return "Hey, Your application started successfully !!!";
	}
	
	@GetMapping("/login")
	public String login() {
		return "Welcome Anita !!!";
	}
	
	@GetMapping("/logout")
	public String logout() {
		return "Successfully logged out";
	}
}
