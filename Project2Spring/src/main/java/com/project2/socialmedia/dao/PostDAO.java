package com.project2.socialmedia.dao;

import java.util.List;

import javax.transaction.Transactional;

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
		return sf.getCurrentSession().get(Post.class,id);
	}

	
	public List<Post> selectAll() {
		return sf.getCurrentSession().createQuery("FROM post",Post.class).list();
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
