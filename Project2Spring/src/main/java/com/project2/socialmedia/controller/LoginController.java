package com.project2.socialmedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project2.socialmedia.dao.UserDAO;
import com.project2.socialmedia.model.Credentials;
import com.project2.socialmedia.model.Users;

@RestController
public class LoginController
{
	@Autowired
	private UserDAO userRepo;
	
	@PostMapping(value="/login")
	@CrossOrigin
	public @ResponseBody String login(@RequestBody Credentials credentials)
	{
		String result = "failed";
		
		if(this.checkCredentials(credentials.getUsername(), credentials.getPassword()))
		{
			result = "success";
		}
		
		return result;
	}
	
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
}
