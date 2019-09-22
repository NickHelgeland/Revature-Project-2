package com.project2.socialmedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project2.socialmedia.dao.Insert;
import com.project2.socialmedia.model.Users;
/**
 * This class is a restful to enroll a user.
 * @author Nick, Ilia, Danny and Fausto
 *
 */
@RestController
public class RegisterUserController 
{
	@Autowired
	Insert<Users> userRepo;
	
	/**
	 * This method get all information about user and save in the database.
	 * @param user
	 */
	@CrossOrigin
	@PostMapping(value="/register")
	public void registerUser(@RequestBody Users user)
	{
		userRepo.insert(user);
	}
}
