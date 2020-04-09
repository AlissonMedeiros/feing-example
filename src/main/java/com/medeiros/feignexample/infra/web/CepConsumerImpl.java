package com.medeiros.feignexample.infra.web;

import com.medeiros.feignexample.application.CepConsumer;
import com.medeiros.feignexample.domain.AddressDto;
import org.springframework.stereotype.Service;

@Service
public class CepConsumerImpl implements CepConsumer {

	private final CepClient cepClient;

	public CepConsumerImpl(CepClient cepClient) {
		this.cepClient = cepClient;
	}

	@Override
	public AddressDto get(String cep) {
		return cepClient.get(cep);
	}

}
