package com.medeiros.feignexample.infra.web;

import feign.Feign;
import feign.Logger;
import feign.jackson.JacksonDecoder;
import feign.slf4j.Slf4jLogger;

public class ClientBuilder {

	public static Feign.Builder of() {
		return Feign.builder()
			.decoder(new JacksonDecoder())
			.logLevel(Logger.Level.FULL);
	}

}
