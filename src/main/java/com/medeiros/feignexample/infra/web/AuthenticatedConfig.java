package com.medeiros.feignexample.infra.web;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Bean;

public class AuthenticatedConfig {

	@Bean
	public RequestInterceptor interceptor() {
		return template -> {
			System.out.println("Apply token");
			template.header("TOKEN", "ADHSDFHUIFSD");
		};
	}
}
