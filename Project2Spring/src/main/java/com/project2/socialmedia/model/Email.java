package com.project2.socialmedia.model;

public class Email {
	
	private String eFromEmail;
	private String ePassword;
	private String eSubject;
	private String eMessage;
	
	public Email() {
	}

	public Email(String eFromEmail, String ePassword, String eSubject, String eMessage) {
		super();
		this.eFromEmail = eFromEmail;
		this.ePassword = ePassword;
		this.eSubject = eSubject;
		this.eMessage = eMessage;
	}

	public String geteFromEmail() {
		return eFromEmail;
	}

	public void seteFromEmail(String eFromEmail) {
		this.eFromEmail = eFromEmail;
	}

	public String getePassword() {
		return ePassword;
	}

	public void setePassword(String ePassword) {
		this.ePassword = ePassword;
	}

	public String geteSubject() {
		return eSubject;
	}

	public void seteSubject(String eSubject) {
		this.eSubject = eSubject;
	}

	public String geteMessage() {
		return eMessage;
	}

	public void seteMessage(String eMessage) {
		this.eMessage = eMessage;
	}	
	
}
