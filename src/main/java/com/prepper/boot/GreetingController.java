package com.prepper.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@RequestMapping("/hello")
	String sayHello() {
		return "hello world";
	}
}
