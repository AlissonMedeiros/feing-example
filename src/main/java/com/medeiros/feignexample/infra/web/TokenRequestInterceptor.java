
package com.medeiros.feignexample.infra.web;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TokenRequestInterceptor implements RequestInterceptor {

	@Override
	public void apply(RequestTemplate template) {
		if (!template.url().contains("/posts")) {
			System.out.println("Apply token");
			template.header("TOKEN", "ADHSDFHUIFSD");
		}
	}

}
