package com.example.dummy.first.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/first")
public class FirstController {

	@GetMapping
	public String getUserDetails() {
		return "User is Not avaialbe";
		
	}
	@GetMapping("/address")
	public ResponseEntity<?> getAddressDetails() {
		return ResponseEntity.ok("User is Not avaialbe");
		
	}
}
