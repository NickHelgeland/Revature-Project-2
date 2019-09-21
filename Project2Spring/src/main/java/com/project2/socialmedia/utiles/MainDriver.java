package com.project2.socialmedia.utiles;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project2.socialmedia.dao.UserDAO;
import com.project2.socialmedia.model.Users;

public class MainDriver {

	public static void main(String[] args) {
		
		Map<String, String> env = System.getenv();
		for (String s : env.keySet())
		{
			System.out.println(s + ": " + env.get(s));
		}
	}
}
