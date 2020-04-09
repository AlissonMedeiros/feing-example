package com.medeiros.feignexample.infra.web;

import com.medeiros.feignexample.domain.AddressDto;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

class CepConsumerImplTest {

	@InjectMocks
	private CepConsumerImpl cepConsumer;
	@Mock
	private CepClient cepClient;

	@BeforeEach
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void whenGetCepThenReturnAddress() {
		Mockito.when(cepClient.get("123")).thenReturn(new AddressDto("123"));
		AddressDto address = cepConsumer.get("123");
		Assertions.assertThat(address.getCep()).isEqualTo("123");
	}

}
