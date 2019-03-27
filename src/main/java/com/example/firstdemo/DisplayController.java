package com.example.firstdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisplayController {

	@RequestMapping("/display")
	public String message()
	{
		return "Welcome to firstdemo program";
	}
	
}
