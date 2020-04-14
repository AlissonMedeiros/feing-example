package com.medeiros.feignexample.controller;

import com.medeiros.feignexample.application.PostConsumer;
import com.medeiros.feignexample.domain.PostDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
public class PostController {

	private PostConsumer postConsumer;

	public PostController(PostConsumer postConsumer) {
		this.postConsumer = postConsumer;
	}

	@GetMapping("/posts")
	public List<PostDTO> getAll() {

		return postConsumer.getAllPost();
	}

}
