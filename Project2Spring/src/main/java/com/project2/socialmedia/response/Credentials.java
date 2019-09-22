package com.project2.socialmedia.response;

/**
 * This class is a bypass to get information from end to back end.
 * @author Nick, Ilia, Danny and Fausto.
 *
 */
public class Credentials
{
	private String username;
	
	private String password;
	
	public Credentials() {}

	public Credentials(String username, String password)
	{		
		this.username = username;
		this.password = password;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}
}
