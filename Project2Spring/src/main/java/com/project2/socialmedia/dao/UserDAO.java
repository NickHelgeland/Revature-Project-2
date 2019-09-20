package com.project2.socialmedia.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project2.socialmedia.model.Users;


@Repository("userRepo")
@Transactional
public class UserDAO implements Insert<Users>, Update<Users>
{
	
		
	@Autowired
	private SessionFactory sf;
	
	
	public void insert(Users obj) {
		sf.getCurrentSession().save(obj);
		
	}

	
	public void update(Users obj) {
		sf.getCurrentSession().update(obj);		
	}

	
	public Users selectOne(String username) {
		Session session = sf.openSession();
		Users user = session.createQuery("from Users where username='" + username + "'", Users.class).uniqueResult();
		return user;
	}

	public List<Users> selectAll() {
		Session session = sf.openSession();
		List<Users> list = session.createQuery("from Users",Users.class).list();
		return list;
	}

}
