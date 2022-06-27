package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class WalletServiceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(WalletServiceAppApplication.class, args);
	}

	// Registers the RestTemplate in Spring Container and will be using Client Side Load Balancer
	@LoadBalanced
	@Bean
	public RestTemplate rest(RestTemplateBuilder builder) {
		return builder.build();
	}
}
