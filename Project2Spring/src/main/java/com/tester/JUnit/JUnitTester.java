package com.tester.JUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.project2.socialmedia.dao.UserDAO;
import com.project2.socialmedia.model.Users;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "*classpath:application-context.xml")
//@ContextConfiguration(classes= UserDAO.class, loader = AnnotationConfigContextLoader.class)
@Transactional
@TransactionConfiguration(defaultRollback=true)
public class JUnitTester {

//	UserDAO uDao = new UserDAO();
//	private Object Users;
	
	@Autowired
	UserDAO uDao;
//	private Users user;
//	Users user = new Users();
	
	
	
//	@Test
//	public void getUserNameTest()
//	{
//		
//		user.setUserName("thedude");
//		
////		assertEquals("should return a record", Users, uDao.selectOne("thedude"));
//		assertEquals( "thedude", user.getUserName());
//	}
	
	@Test
	public void getUserData()
	{
		Users user = uDao.selectOne("theDude");
		
		Assert.assertEquals("theDude", user.getUserName());
		
	}
	
}
