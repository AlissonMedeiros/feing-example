package com.medeiros.feignexample.infra.web;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeingConfiguration {

	@Bean
	public Contract contract(){
		return new Contract.Default();
	}
}
