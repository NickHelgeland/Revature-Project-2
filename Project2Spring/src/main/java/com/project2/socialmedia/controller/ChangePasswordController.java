package com.project2.socialmedia.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project2.socialmedia.dao.UserDAO;
import com.project2.socialmedia.model.Users;
import com.project2.socialmedia.response.Credentials;
import com.project2.socialmedia.response.UserChange;
/**
 * This class is a restful API for PasswordReset  
 * @author Nick, Ilia, Danny and Fausto
 *
 */
@RestController
public class ChangePasswordController {
	
	@Autowired
	UserDAO userDao;
	/**
	 * This method is an endpoint to get information the user to change the
	 * password. it has the parameters requestUser, httpSession
	 * @param requestUser
	 * @param httpSession
	 */
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/passwordReset")
	public void resetPassword(@RequestBody Credentials requestUser) {
		Users user = userDao.selectOne(requestUser.getUsername());
		user.setPassWord(requestUser.getPassword());
		userDao.update(user);
	}
}
