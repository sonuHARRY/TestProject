package com.sonu.App.HellWorldSpringBoot;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.sonu.App.HelloWorldSpringBoot.controller")
public class HelloWorldSpringBoot {
	

	public static void main(String[] args) {


SpringApplication.run(HelloWorldSpringBoot.class,args);
	}

}
