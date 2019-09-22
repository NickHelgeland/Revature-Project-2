package com.project2.socialmedia.model;

public class Email {
	
	private String eFromEmail = "personal56company@gmail.com";
	private String ePassword = "Personal_01";
	private String eSubject = " , you reuqest ";
	private String eMessage = "<h1>Change of password<h1> <br>You have requested to"
			+ " change your password, if you did not request this change, please"
			+ " ignore this message or contact our customer support"
			+ " for more help.<p>";
	
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
