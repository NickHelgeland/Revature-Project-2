package com.project2.socialmedia.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project2.socialmedia.model.User;


@Repository("users")
@Transactional
public class UserDAO implements Insert<User>, Update<User>, Select<User>
{
	
	@Autowired
	private SessionFactory sf;
	
	
	public void insert(User obj) {
		sf.getCurrentSession().save(obj);
		
	}


	public void update(User obj) {
		sf.getCurrentSession().update(obj);		
	}


	public User selectOne(int id) {
		return sf.getCurrentSession().get(User.class,id);
	}


	public List<User> selectAll() {
		return sf.getCurrentSession().createQuery("from user",User.class).list();
	}

}
