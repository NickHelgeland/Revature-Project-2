package com.project2.socialmedia.utiles;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.login.Configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project2.socialmedia.dao.UserDAO;
import com.project2.socialmedia.model.User;

public class MainDriver {
	public static ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	//@Qualifier("userRepo")
	//@Autowired
	
	public static UserDAO userDao = appContext.getBean("userRepo", UserDAO.class);

	public static void main(String[] args) {
		//insertInitialValues();
		
		List<User> userList = new ArrayList<>();
		
		userList = userDao.selectAll();
		
		for (User u : userList) {
			System.out.println("All users " + u);
		}
	}
	
public static void insertInitialValues() {
		
		User user1 = new User("frer1972", "tino1972","Fausto","Espinoza","frerespinoza@gmailcom","8125 Rosber Ln");
		userDao.insert(user1);
		User user2 = new User("frer1973", "tino1973","Fausto1","Espinoza1","frerespinoza@gmailcom","8125 Rosber Ln");
		userDao.insert(user2);
		User user3 = new User("frer1974", "tino1974","Fausto2","Espinoza2","frerespinoza@gmailcom","8125 Rosber Ln");
		userDao.insert(user3);
		User user4 = new User("frer1975", "tino1975","Fausto3","Espinoza3","frerespinoza@gmailcom","8125 Rosber Ln");
		userDao.insert(user4);
		
		
	}

}
