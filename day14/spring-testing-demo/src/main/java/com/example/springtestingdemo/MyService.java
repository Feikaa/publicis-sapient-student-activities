package com.example.springtestingdemo;

import org.springframework.stereotype.Service;

@Service
public class MyService {

	public String welcome(String name) {
		return "Welcome "+name;
	}
}
