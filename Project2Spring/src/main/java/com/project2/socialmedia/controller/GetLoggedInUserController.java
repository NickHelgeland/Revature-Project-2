package com.project2.socialmedia.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project2.socialmedia.dao.UserDAO;
import com.project2.socialmedia.model.Users;

/**
 * This class is a restful to get a single user
 * @author frere
 *
 */
@RestController
public class GetLoggedInUserController 
{	
	@Autowired
	UserDAO userRepo;
	/**
	 * This method is an endpoint to find the user in the database and 
	 * return the user
	 * @param httpSession
	 * @return
	 */
	@CrossOrigin
	@GetMapping(value="/getLoggedInUser")
	public Users getLoggedInUser(HttpSession httpSession)
	{
		String username = httpSession.getAttribute("username").toString();
		Users user = userRepo.selectOne(username);
		
		return user;
	}
}
