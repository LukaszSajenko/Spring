package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.ipc.http.HttpSender.Response;


public class HelloWorldApplication {

	//public String HelloWorld() {
	public static void main(String[] args) {	
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
