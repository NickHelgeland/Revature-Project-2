package com.project2.socialmedia.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project2.socialmedia.model.Friends;

@Repository("friendsRepo")
@Transactional
public class FriendsDAO implements Insert<Friends>, Update<Friends>,  Delete<Friends>, Select<Friends> {

	@Autowired
	private SessionFactory sf;
	
	public Friends selectOne(int id) {
		return sf.getCurrentSession().get(Friends.class,id);
	}

	
	public List<Friends> selectAll() {
		return sf.getCurrentSession().createQuery("FROM friends",Friends.class).list();
	}

	
	public void delete(Friends obj) {
		sf.getCurrentSession().delete(obj);
	}

	
	public void update(Friends obj) {		
		sf.getCurrentSession().update(obj);
	}

	
	public void insert(Friends obj) {
		sf.getCurrentSession().save(obj);
	}
}
