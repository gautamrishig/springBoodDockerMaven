package com.javaram;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetMessageClass {
	
	
	@GetMapping("/msg")
	public String getMessage() {
		return "Welcome to JavaRam.. In this project use the maven pluging and push to the doker!!";
	}

}
