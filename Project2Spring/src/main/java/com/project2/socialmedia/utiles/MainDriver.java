package com.project2.socialmedia.utiles;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project2.socialmedia.dao.UserDAO;
import com.project2.socialmedia.model.Email;
import com.project2.socialmedia.model.Users;

public class MainDriver {

	public static void main(String[] args) {
		
		Email email = new Email();
		Users user = new Users();
		
		user.setFirstName("Fausto");
		user.setEmail("frerespinoza@gmail.com");
		
		if(SendMail.sendMail(email, user))  System.out.println("Done");
		
	}
	
}
