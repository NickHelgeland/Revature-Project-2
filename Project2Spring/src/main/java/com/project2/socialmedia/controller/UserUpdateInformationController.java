package com.project2.socialmedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project2.socialmedia.dao.UserDAO;
import com.project2.socialmedia.model.Users;

@RestController
public class UserUpdateInformationController {

	@Autowired
	UserDAO userDao;
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/updateUser")
	public void  updateUser(@RequestBody Users user) {
		userDao.update(user);
	}
}
