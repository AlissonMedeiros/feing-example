package com.medeiros.feignexample.application;

import com.medeiros.feignexample.domain.PostDTO;

import java.util.List;

public interface PostConsumer {

	public List<PostDTO> getAllPost();

}
