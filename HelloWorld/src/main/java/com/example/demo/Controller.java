package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

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
