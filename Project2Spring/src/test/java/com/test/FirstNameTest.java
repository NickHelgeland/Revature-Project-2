package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.project2.socialmedia.dao.UserDAO;
import com.project2.socialmedia.model.Users;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = )
@ContextConfiguration
public class FirstNameTest {
	
	@Autowired
	UserDAO userDao;
	
	@Test
	public void testFirstName() {
		Users user = userDao.selectOneEmail("frerespinoza@gmail.com");
		assertEquals(user.getFirstName(),"Fausto");
	}

}
