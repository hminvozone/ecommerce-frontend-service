package com.ecommerce.thymleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ThymleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThymleafApplication.class, args);
	}

}
