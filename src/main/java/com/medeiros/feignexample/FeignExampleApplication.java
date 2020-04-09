package com.medeiros.feignexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class FeignExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignExampleApplication.class, args);
	}

}
