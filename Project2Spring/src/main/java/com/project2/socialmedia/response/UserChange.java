package com.project2.socialmedia.response;

/**
 * This class provide the email, passWord  as ecrypTp.
 * @author Nick, Ilia, Danny and Fausto.
 *
 */

public class UserChange {
	
	private String email;
	private String passWord;
	private String ecryptP;
	
	/**
	 * Construct no initialize anything
	 */
	public UserChange() {
	}	
	
	/**
	 * Construct and initializes a UserChange (email, passWord, ecryptP)
	 * @param email
	 * @param passWord
	 * @param ecryptP
	 */
	public UserChange(String email, String passWord, String ecryptP) {
		super();
		this.email = email;
		this.passWord = passWord;
		this.ecryptP = ecryptP;
	}
	/**
	 * Method get the information from email and return email 
	 * @return
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Method set a email (email)
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Method Return PassWord
	 * @return String
	 */
	public String getPassWord() {
		return passWord;
	}
	
	
	/**
	 * Methos set password (pasword)
	 * @param passWord
	 */
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	/**
	 * Method return encrypt password
	 * @return String
	 */
	public String getEcryptP() {
		return ecryptP;
	}
	/**
	 * Method set a encrypt password(ecryptP)
	 * @param ecryptP
	 */
	public void setEcryptP(String ecryptP) {
		this.ecryptP = ecryptP;
	}
	
	@Override
	public String toString() {
		return "UserChange [email=" + email + ", passWord=" + passWord + ", ecryptP=" + ecryptP + "]";
	}
	
	
	
}
