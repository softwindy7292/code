package edu.ict.ex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestHelloController {

	@GetMapping("/")
	public String hello() {
		return "안녕하세요";
	}

	@GetMapping("/hello")
	public String hello2() {
		return "Hello";
	}
	
	@GetMapping("/myname")
	public String hello3() {
		return "김선우";
	}

}