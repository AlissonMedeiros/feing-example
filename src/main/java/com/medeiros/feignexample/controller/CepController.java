package com.medeiros.feignexample.controller;

import com.medeiros.feignexample.application.CepConsumer;
import com.medeiros.feignexample.domain.AddressDto;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class CepController {

	private CepConsumer cepConsumer;

	public CepController(CepConsumer cepConsumer) {
		this.cepConsumer = cepConsumer;
	}

	@GetMapping("/ceps/{cep}")
	@Cacheable("ceps")
	public AddressDto get(@PathVariable("cep") String cep) {
		return cepConsumer.get(cep);
	}

}
