package com.example.MyTestignStart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan("com")
public class MyTestignStartApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyTestignStartApplication.class, args);
	}
}
