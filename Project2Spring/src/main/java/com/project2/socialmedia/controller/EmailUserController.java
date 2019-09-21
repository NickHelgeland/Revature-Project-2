package com.project2.socialmedia.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project2.socialmedia.dao.UserDAO;
import com.project2.socialmedia.model.Email;
import com.project2.socialmedia.model.Users;
import com.project2.socialmedia.response.UserChange;
import com.project2.socialmedia.utiles.SendMail;

@RestController
public class EmailUserController {
	@Autowired
	UserDAO userDao;
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping(value = "/email")
	public void sendMail(@RequestBody UserChange requestUser, HttpSession httpSession)
	{
		
		httpSession.setAttribute("user", requestUser);
		System.out.println(requestUser);
		
//		Users user = userDao.selectOneEmail(requestUser.getEmail());		
//		user.setPassWord(requestUser.getEcryptP());
//		userDao.update(user);		
//		Email email = new Email();
//		email.seteMessage(email.geteMessage() + "<br><p>temporary Password " 
//		+ requestUser.getPassWord() + "</p>");
//		SendMail.sendMail(email, user);
	}

}
