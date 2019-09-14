package com.project2.socialmedia.dao;

import java.util.List;

import org.hibernate.Session;
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
		Session session = sf.openSession();
		Friends friend = session.get(Friends.class,id);
		session.close();
		return friend;
	}

	
	public List<Friends> selectAll() {
		Session session = sf.openSession();
		List<Friends> list = session.createQuery("FROM friends",Friends.class).list();
		session.close();
		return list;
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
