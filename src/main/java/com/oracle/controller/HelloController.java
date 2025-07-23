package com.oracle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	//url - http://localhost:8080/spring-mvc/sayHello.do
	
	@GetMapping(path= "/sayHello.do")
	
	public String sayHello() {
		return "hello";     //this will return /web-inf/views/hello.jsp
	}
}
