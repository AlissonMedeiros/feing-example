package com.medeiros.feignexample.infra.web;

import com.medeiros.feignexample.domain.PostDTO;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url = "https://jsonplaceholder.typicode.com/", name = "post")
public interface PostClient {

	@GetMapping("/posts")
	@RequestLine("GET /posts")
	public List<PostDTO> getAllPost();

}
