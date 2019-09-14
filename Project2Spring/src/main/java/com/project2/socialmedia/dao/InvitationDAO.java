package com.project2.socialmedia.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project2.socialmedia.model.Invitation;

@Repository("invitation")
@Transactional
public class InvitationDAO implements Insert<Invitation>, Update<Invitation>,  Delete<Invitation>, Select<Invitation>{

	@Autowired
	private SessionFactory sf;
	
	public Invitation selectOne(int id) {
		return sf.getCurrentSession().get(Invitation.class,id);
	}

	
	public List<Invitation> selectAll() {
		return sf.getCurrentSession().createQuery("FROM invitation",Invitation.class).list();
	}

	
	public void delete(Invitation obj) {
		sf.getCurrentSession().delete(obj);
	}

	
	public void update(Invitation obj) {
		sf.getCurrentSession().update(obj);
	}

	
	public void insert(Invitation obj) {
		sf.getCurrentSession().save(obj);
	}

}
