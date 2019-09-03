package com.sonu.App.HelloWorldSpringBoot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController {
	@RequestMapping("/")
public String hello() {
	return "<html><body><h1>Hello World!!!</html></body></h1>";
}
	@RequestMapping("/new")
public String Create() {
	return "<html><body><h1>Hey Hari!!! Welcome to my page</html></body></h1>";
	}
	@RequestMapping("/hi")
public String Frame() {
	return "<html><body><h1>Enter to my page</html></body></h1>";
}
}


