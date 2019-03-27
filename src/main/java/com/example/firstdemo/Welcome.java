package com.example.firstdemo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
	
	@RequestMapping("/")
	public String defultMsg()
	{
		return "Default Message";
	}

	@RequestMapping("/anant/{surname}")
	public String welcome(@PathVariable("surname") String sname)
	{
		String fullname = "Hi Anant " + sname;
		
		return fullname;
	}
	 
	@RequestMapping("/hello")
	public String hello()
	{
	
		return "Hello there";
	}
	
	@RequestMapping("/message")
	public String message()
	{
	
		return "Message RequestMapping";
	}
}
