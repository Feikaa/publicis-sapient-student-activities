package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/wallet")
public class WalletController {

	@Autowired
	private RestTemplate rest;
	
	@GetMapping
	public String welcome() {
		String result = rest.getForObject("http://account-service/account", String.class);
		return "Wallet service got, "+result;
	}
}
