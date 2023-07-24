package com.Sarvesh.intro_tosb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping("/")
	public String test() {
			return "Test api works";
		
	}
	@RequestMapping("/home")
	public String home() {
		return "Welcome to the home page";
	}
	

}
