package com.example.dummy.second.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/second")
public class SecondController {

	@GetMapping("/home")
	public String getAddress() {
		////
		return "Chennai TNagar";
		
	}

}
