package com.project2.socialmedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project2.socialmedia.dao.Insert;
import com.project2.socialmedia.model.Users;

@RestController
public class RegisterUserController 
{
	@Autowired
	Insert<Users> userRepo;
	
	@CrossOrigin
	@PostMapping(value="/register")
	public void registerUser(@RequestBody Users user)
	{
		Users testUser = user;
		userRepo.insert(user);
	}
}
