package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.util.Scanner;

@RestController
@RequestMapping("/api")
public class Controller {

	@GetMapping("/hello")
	public String HelloWorld() {
		return "Hello World!";
	}

	@GetMapping("/date")
	public LocalDateTime now() {
		return LocalDateTime.now();
	}

	@GetMapping("/welcome/{userId}")
	public String getUser(@PathVariable String userId) {
		return userId;
	}

	@GetMapping("/hi/foos")
	public String getFoos(@RequestParam(required = false) String Id) {
		return Id;
	}

}
