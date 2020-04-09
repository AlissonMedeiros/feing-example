package com.medeiros.feignexample.infra.web;

import com.medeiros.feignexample.domain.AddressDto;
import feign.mock.HttpMethod;
import feign.mock.MockClient;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CepClientTest {

	private CepClient cepClient;
	private MockClient mockClient;

	@BeforeEach
	public void init() {
		mockClient = new MockClient()
			.ok(HttpMethod.GET, "https://viacep.com.br/ws/a/json/", "{\n" +
				"  \"cep\": \"01001-000\",\n" +
				"  \"logradouro\": \"Praça da Sé\",\n" +
				"  \"complemento\": \"lado ímpar\",\n" +
				"  \"bairro\": \"Sé\",\n" +
				"  \"localidade\": \"São Paulo\",\n" +
				"  \"uf\": \"SP\",\n" +
				"  \"unidade\": \"\",\n" +
				"  \"ibge\": \"3550308\",\n" +
				"  \"gia\": \"1004\"\n" +
				"}");
		cepClient = ClientBuilder.of(mockClient)
			.target(CepClient.class, "https://viacep.com.br/ws/");
	}

	@Test
	public void whenCallCepServiceThenReturnAddress() {
		AddressDto address = cepClient.get("a");
		Assertions.assertThat(address).isNotNull();
		mockClient.verifyOne(HttpMethod.GET, "https://viacep.com.br/ws/a/json/");
	}

	@Test
	public void whenHasNeighborhoodThenReturn() {
		AddressDto address = cepClient.get("a");
		Assertions.assertThat(address.getBairro()).isEqualTo("Sé");
	}

}
