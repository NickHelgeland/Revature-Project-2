package com.project2.socialmedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.project2.socialmedia.dao.UserDAO;
import com.project2.socialmedia.model.Users;

@RestController
public class GetLoggedInUserController 
{	
	@Autowired
	UserDAO userRepo;
	
	@CrossOrigin
	@GetMapping(value="/getLoggedInUser/{username}")
	public Users getLoggedInUser(@PathVariable String username)
	{
		Users user = userRepo.selectOne(username);
		
		return user;
	}
}
