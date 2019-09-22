package com.project2.socialmedia.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project2.socialmedia.dao.UserDAO;
import com.project2.socialmedia.model.Users;
import com.project2.socialmedia.response.UpdatedInformation;
/**
 * this class is a restful to update information to the user.
 * @author Nick, Ilia, Danny and Fausto.
 *
 */
@RestController
public class UserUpdateInformationController {

	@Autowired
	UserDAO userRepo;
	/**
	 * This method is an endpoint to retrieve information about the user and
	 * update it, use the parameters user and session.
	 * @param user
	 * @param session
	 */
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/updateUser")
	public void  updateUser(@RequestBody UpdatedInformation info) 
	{
		Users user = userRepo.selectOne(info.getUsername());
		user.setFirstName(info.getFirstName());
		user.setLastName(info.getLastName());
		user.setAddress(info.getAddress());
		user.setEmail(info.getEmail());
		
		userRepo.update(user);
	}
}
