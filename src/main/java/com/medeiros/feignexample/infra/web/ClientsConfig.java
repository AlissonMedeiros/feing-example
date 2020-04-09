package com.medeiros.feignexample.infra.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientsConfig {

	@Bean
	public CepClient cepClient() {
		return ClientBuilder.of()
			.target(CepClient.class, "https://viacep.com.br/ws/");
	}

}
