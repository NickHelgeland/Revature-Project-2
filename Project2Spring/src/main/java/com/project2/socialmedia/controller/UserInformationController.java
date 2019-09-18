package com.project2.socialmedia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project2.socialmedia.dao.UserDAO;
import com.project2.socialmedia.model.Users;

@RestController
public class UserInformationController {
	
	@Autowired
	UserDAO userDao;
	
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/getUsers")
	public /*@ResponseBody*/ List<Users>  getAllUser() {
		return userDao.selectAll();
	}

}
