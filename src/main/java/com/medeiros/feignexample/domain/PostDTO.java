package com.medeiros.feignexample.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
    "userId",
    "id",
    "title",
    "body"
})
public class PostDTO {

	@JsonIgnore
	private Integer userId;
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("title")
	private String title;
	@JsonIgnore
	private String body;


	public PostDTO(Integer id, String title) {
		this.id = id;
		this.title = title;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}



}
