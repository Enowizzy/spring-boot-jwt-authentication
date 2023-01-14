package com.eLearningbackend.eLearning.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class AuthController {

	@GetMapping({"/admin"})
	public String forAdmin() {
		return "This URL is only accessible for admin";
	}
	
	@GetMapping({"/user"})
	public String forUser() {
		return "This URL is only accessible for users";
	}
}
