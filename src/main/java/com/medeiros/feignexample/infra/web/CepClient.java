package com.medeiros.feignexample.infra.web;

import com.medeiros.feignexample.domain.AddressDto;
import feign.Param;
import feign.RequestLine;

public interface CepClient {

	@RequestLine("GET /{cep}/json/")
	AddressDto get(@Param("cep") String cep);

}
