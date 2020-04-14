package com.medeiros.feignexample;

import feign.Contract;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableCaching
@EnableFeignClients(defaultConfiguration = FeignExampleApplication.Config.class)
public class FeignExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignExampleApplication.class, args);
	}

	class Config {

		@Bean
		public Contract contract() {
			return new Contract.Default();
		}

	}

}
