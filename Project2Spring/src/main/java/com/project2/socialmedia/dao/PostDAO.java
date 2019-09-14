package com.project2.socialmedia.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project2.socialmedia.model.Post;

@Repository("postRepo")
@Transactional
public class PostDAO implements Insert<Post>, Update<Post>,  Delete<Post>, Select<Post>{

	@Autowired
	private SessionFactory sf;

	
	public Post selectOne(int id) {
		Session session = sf.openSession();
		Post post = session.get(Post.class,id);
		session.close();
		return post;
	}

	
	public List<Post> selectAll() {
		Session session = sf.openSession();
		List<Post> posts = session.createQuery("FROM post",Post.class).list();
		session.close();
		return posts;
	}

	
	public void delete(Post obj) {
		sf.getCurrentSession().delete(obj);		
	}

	
	public void update(Post obj) {
		sf.getCurrentSession().update(obj);		
	}

	
	public void insert(Post obj) {
		sf.getCurrentSession().save(obj);		
	}
	
	
}
