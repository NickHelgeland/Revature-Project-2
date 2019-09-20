package com.project2.socialmedia.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project2.socialmedia.model.Email;
import com.project2.socialmedia.model.Users;
import com.project2.socialmedia.utiles.SendMail;

@RestController
public class EmailUserController {
	
	@GetMapping(value = "/email")
	public void sendMail(@RequestBody Users user)
	{
		Email email = new Email();
		SendMail.sendMail(email, user);
	}

}
