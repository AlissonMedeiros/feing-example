package com.medeiros.feignexample.infra.web;

import com.medeiros.feignexample.application.PostConsumer;
import com.medeiros.feignexample.domain.PostDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostConsumerImpl implements PostConsumer {

	private final PostClient postClient;

	public PostConsumerImpl(PostClient postClient) {
		this.postClient = postClient;
	}

	@Override
	public List<PostDTO> getAllPost() {
		return postClient.getAllPost();
	}

}
