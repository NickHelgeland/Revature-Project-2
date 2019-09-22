package com.project2.socialmedia.response;

public class UpdatedInformation 
{
	private String username;
	
	private String firstName;
	
	private String lastName;
	
	private String address;
	
	private String email;

	public UpdatedInformation(String username, String firstname, String lastname, String address, String email) {
		super();
		this.username = username;
		this.firstName = firstname;
		this.lastName = lastname;
		this.address = address;
		this.email = email;
	}
	
	public UpdatedInformation() {}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstname) {
		this.firstName = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastname) {
		this.lastName = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
