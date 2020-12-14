package com.emsi.tp4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={
"com.emsi.tp4", "com.emsi.tp4.dao","com.emsi.tp4.service"})
public class Tp4Application {

	public static void main(String[] args) {
		SpringApplication.run(Tp4Application.class, args);
	}

}
