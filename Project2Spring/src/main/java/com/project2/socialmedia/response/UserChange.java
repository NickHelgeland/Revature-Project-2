package com.project2.socialmedia.response;

public class UserChange {
	
	private String email;
	private String passWord;
	private String ecryptP;
	
	public UserChange() {
	}	

	public UserChange(String email, String passWord, String ecryptP) {
		super();
		this.email = email;
		this.passWord = passWord;
		this.ecryptP = ecryptP;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getEcryptP() {
		return ecryptP;
	}

	public void setEcryptP(String ecryptP) {
		this.ecryptP = ecryptP;
	}

	@Override
	public String toString() {
		return "UserChange [email=" + email + ", passWord=" + passWord + ", ecryptP=" + ecryptP + "]";
	}
	
	
	
}
