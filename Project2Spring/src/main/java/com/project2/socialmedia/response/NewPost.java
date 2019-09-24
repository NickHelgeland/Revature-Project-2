package com.project2.socialmedia.response;

public class NewPost 
{
	private String username;
	
	private String content;

	public NewPost(String username, String content) {
		super();
		this.username = username;
		this.content = content;
	}
	
	public NewPost() {}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
