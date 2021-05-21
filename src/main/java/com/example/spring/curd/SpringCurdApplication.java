package com.example.spring.curd;

import com.example.spring.curd.entity.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCurdApplication {

	public static void main(String[] args) {
		//Product obj = new Product("hike");
		SpringApplication.run(SpringCurdApplication.class, args);
	}

}
