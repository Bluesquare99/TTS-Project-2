package com.tts.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Moreover, Spring Boot introduces the @SpringBootApplication annotation.
//This single annotation is equivalent to using @Configuration, @EnableAutoConfiguration, and @ComponentScan.
@SpringBootApplication
public class EcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}

}
