package com.project2.socialmedia.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project2.socialmedia.model.Users;

/**
 * This class provide the dao implementation for Users.
 * @author Nick, Ilia, Danny and Fausto.
 *
 */
@Repository("userRepo")
@Transactional
public class UserDAO implements Insert<Users>, Update<Users>
{
	
		
	@Autowired
	private SessionFactory sf;
	
	/**
	 * This method insert data in the DataBase.
	 */
	public void insert(Users obj) {
		sf.getCurrentSession().save(obj);
		
	}

	/**
	 * This method update the database. 
	 */
	public void update(Users obj) {
		sf.getCurrentSession().merge(obj);		
	}

	/**
	 * This method return user if it find a user in the database with 
	 * the parameter (username).
	 * @param username
	 * @return Users
	 */
	public Users selectOne(String username) {
		Session session = sf.openSession();
		Users user = session.createQuery("from Users where username='" + username + "'", Users.class).uniqueResult();
		return user;
	}
	
	/**
	 * this method return user if it find by email (email) in the parameter.
	 * @param email
	 * @return Users
	 */
	public Users selectOneEmail(String email) {
		Session session = sf.openSession();
		Users user = session.createQuery("from Users where email='" + email + "'", Users.class).uniqueResult();
		return user;
	}

	/**
	 * This method return all users.
	 * @return List<Users>
	 */
	public List<Users> selectAll() {
		Session session = sf.openSession();
		List<Users> list = session.createQuery("from Users",Users.class).list();
		return list;
	}

}
