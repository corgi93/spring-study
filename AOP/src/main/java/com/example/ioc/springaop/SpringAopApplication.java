package com.example.ioc.springaop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Base64;

@SpringBootApplication
public class SpringAopApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
		System.out.println("email encoding: " + Base64.getEncoder()
				.encodeToString(("gurwls714" +
				"@gmail.com").getBytes())) ;
	}
}
