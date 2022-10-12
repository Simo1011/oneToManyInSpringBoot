package com.emonics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("/hello")
	public String sayHello()
	{
		System.out.println("Hello controller !!...");
		return "hello";
	}
	

}
