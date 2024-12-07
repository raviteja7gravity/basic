package com.practice.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicApplication {

	public static void main(String[] args) {
		System.out.println("first spring boot project");
		SpringApplication.run(BasicApplication.class, args);
	}

}
