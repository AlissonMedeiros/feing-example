package com.medeiros.feignexample.infra.web;

import com.medeiros.feignexample.domain.AddressDto;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@FeignClient(name = "CepClient", url = "https://viacep.com.br/ws/")
public interface CepClient {

	@RequestLine("GET /{cep}/json/")
	AddressDto get(@Param("cep") String cep);

}
