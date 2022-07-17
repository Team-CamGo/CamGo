package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class CamGoApplication {

	@RequestMapping("/")
	public String index() {
		return "hello world";
	}
	public static void main(String[] args) {
		SpringApplication.run(CamGoApplication.class, args);
	}

}
