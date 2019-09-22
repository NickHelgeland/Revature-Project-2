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
/**
 * This class is a restful for sending all users
 * @author frere
 *
 */
@RestController
public class UserInformationController {
	
	@Autowired
	UserDAO userDao;
	/**
	 * This method return all users to get at the html page.
	 * @return
	 */
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/getUsers")
	public /*@ResponseBody*/ List<Users>  getAllUser() {
		return userDao.selectAll();
	}
}
