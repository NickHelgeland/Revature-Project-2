package com.project2.socialmedia.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project2.socialmedia.dao.UserDAO;
import com.project2.socialmedia.model.Users;
import com.project2.socialmedia.response.Credentials;
import com.project2.socialmedia.response.Result;
/**
 * This is a restful to login the app.
 * @author Nick, Ilia, Danny and Fausto.
 *
 */
@RestController
public class LoginController
{
	@Autowired
	private UserDAO userRepo;
	/**
	 * This method is the main, gets the credentials and verify is ok to log
	 * in the app. 
	 * @param credentials
	 * @param httpSession
	 * @return
	 */
	@CrossOrigin
	@PostMapping(value="/login")
	public Result login(@RequestBody Credentials credentials, HttpSession httpSession)
	{
		Result result = new Result("failed");
		
		if(this.checkCredentials(credentials.getUsername(), credentials.getPassword()))
		{
			result.setResult("success");
			this.initializeSession(credentials.getUsername(), httpSession);
		}
		
		return result;
	}
	
	/**
	 * This method verify the credentils are correct to long in to the app
	 * application.
	 * @param username
	 * @param password
	 * @return boolean
	 */
	private boolean checkCredentials(String username, String password)
	{
		boolean success = false;
        Users user = userRepo.selectOne(username);

        if (user != null)
        {
            if (user.getPassWord().equals(password))
            {
                success = true;
            }
        }

        return success;
	}
	
	/**
	 * This method is to get the Attribute username.	
	 * @param username
	 * @param session
	 */
	private void initializeSession(String username, HttpSession session)
	{
		session.setAttribute("username", username);
	}
}
