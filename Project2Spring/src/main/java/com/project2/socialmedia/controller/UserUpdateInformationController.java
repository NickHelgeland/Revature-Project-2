package com.project2.socialmedia.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project2.socialmedia.dao.UserDAO;
import com.project2.socialmedia.model.Users;
/**
 * this class is a restful to update information to the user.
 * @author frere
 *
 */
@RestController
public class UserUpdateInformationController {

	@Autowired
	UserDAO userDao;
	/**
	 * This method is an endpoint to retrieve information about the user and
	 * update it, use the parameters user and session.
	 * @param user
	 * @param session
	 */
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/updateUser")
	public void  updateUser(@RequestBody Users user, HttpSession session) {
		session.setAttribute("username", user);
		userDao.update(user);
	}
}
