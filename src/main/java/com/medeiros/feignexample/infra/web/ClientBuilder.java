package com.medeiros.feignexample.infra.web;

import feign.Client;
import feign.Feign;
import feign.Logger;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;

public class ClientBuilder {

	public static Feign.Builder of() {
		Client httpClient = new OkHttpClient();
		return of(httpClient);
	}

	public static Feign.Builder of(Client client) {
		return Feign.builder()
			.client(client)
			.encoder(new JacksonEncoder())
			.decoder(new JacksonDecoder())
			.requestInterceptor(requestTemplate -> {
				System.out.println("Apply token");
				requestTemplate.header("TOKEN", "ADHSDFHUIFSD");
			})
			.logger(new Slf4jLogger(CepClient.class))
			.logLevel(Logger.Level.FULL);
	}

}
