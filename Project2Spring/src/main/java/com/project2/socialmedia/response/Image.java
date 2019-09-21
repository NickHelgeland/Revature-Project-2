package com.project2.socialmedia.response;

public class Image 
{
	private String name;
	
	private String username;

	public Image(String name, String username) {
		super();
		this.name = name;
		this.username = username;
	}
	
	public Image() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
