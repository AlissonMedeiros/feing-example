package com.medeiros.feignexample.application;

import com.medeiros.feignexample.domain.AddressDto;

public interface CepConsumer {

	AddressDto get(String cep);

}
