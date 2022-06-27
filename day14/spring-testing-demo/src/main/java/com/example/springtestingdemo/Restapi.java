package com.example.springtestingdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Restapi {

	@Autowired
	private MyService service;
	
	@GetMapping("{name}")
	public String greet(@PathVariable("name") String name) {
		String result = service.welcome(name);
		return result.toUpperCase();
	}
}
