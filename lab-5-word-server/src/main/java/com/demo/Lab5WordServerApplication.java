package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Lab5WordServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab5WordServerApplication.class, args);
	}
}
