package com.project2.socialmedia.response;
/**
 * This class is a bypass to get information from end to back end.
 * @author Nick, Ilia, Danny and Fausto.
 *
 */
public class Result
{
	String result = "";

	public Result(String result)
	{		
		this.result = result;
	}

	public String getResult()
	{
		return result;
	}

	public void setResult(String result)
	{
		this.result = result;
	}
}
