package com.main.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CacheJavaSpringbootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CacheJavaSpringbootAppApplication.class, args);
	}

}
