package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;

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

}
