package com.project2.socialmedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project2.socialmedia.dao.UserDAO;
import com.project2.socialmedia.model.Users;
import com.project2.socialmedia.response.Image;

/**
 * This class change the logo of the application.
 * @author Nick, Ilia, Danny and Fausto.
 *
 */
@RestController
public class UpdateProfileImageController 
{
	@Autowired
	UserDAO userRepo;
	/**
	 * That is an sndpoint to update the image
	 * @param image
	 */
	@CrossOrigin
	@PostMapping(value = "/updateImage")
	public void updateImage(@RequestBody Image image)
	{
		Users user = userRepo.selectOne(image.getUsername());
		user.setImageName(image.getName());
		
		userRepo.update(user);
	}
}
