package com.project2.socialmedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.project2.socialmedia.dao.Select;
import com.project2.socialmedia.dao.UserDAO;
import com.project2.socialmedia.model.Users;
/**
 * 
 * @author Nick, Ilia, Danny and Fausto
 *
 */
@RestController
public class GetProfileImageController 
{
	@Autowired
	UserDAO userRepo;
	/**
	 * 
	 * @param username
	 * @return String
	 */
	@CrossOrigin
	@GetMapping(value = "/getProfilePic/{username}")
	public String getImageName(@PathVariable String username)
	{
		Users user = userRepo.selectOne(username);
		
		
		return user.getImageName();
	}
	
}
