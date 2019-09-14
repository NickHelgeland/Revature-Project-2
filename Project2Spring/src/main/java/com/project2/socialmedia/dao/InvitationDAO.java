package com.project2.socialmedia.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project2.socialmedia.model.Invitation;

@Repository("invitationRepo")
@Transactional
public class InvitationDAO implements Insert<Invitation>, Update<Invitation>,  Delete<Invitation>, Select<Invitation>{

	@Autowired
	private SessionFactory sf;
	
	public Invitation selectOne(int id) {
		Session session = sf.openSession();
		Invitation invitation = session.get(Invitation.class,id);
		session.close();
		return invitation;
	}

	
	public List<Invitation> selectAll() {
		Session session = sf.openSession();
		List<Invitation> list = session.createQuery("FROM invitation",Invitation.class).list();
		session.close();
		return list;
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
