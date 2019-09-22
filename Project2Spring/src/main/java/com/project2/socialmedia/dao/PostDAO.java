package com.project2.socialmedia.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project2.socialmedia.model.Post;
/**
 * This class provide the dao implementation for Post.
 * @author Nick, Ilia, Danny and Fausto.
 *
 */
@Repository("postRepo")
@Transactional
public class PostDAO implements Insert<Post>, Update<Post>,  Delete<Post>, Select<Post>{

	@Autowired
	private SessionFactory sf;
	/**
	 * This method return post if it find a user in the database with 
	 * the parameter (id).
	 * @param id
	 * @return Post
	 */
	public Post selectOne(int id) {
		Session session = sf.openSession();
		Post post = session.get(Post.class,id);
		session.close();
		return post;
	}

	/**
	 * This method return all post of the database.
	 * @return List<Post>
	 */
	public List<Post> selectAll() {
		Session session = sf.openSession();
		List<Post> posts = session.createQuery("FROM post",Post.class).list();
		session.close();
		return posts;
	}

	/**
	 * This method delete a record of the database.
	 */
	public void delete(Post obj) {
		sf.getCurrentSession().delete(obj);		
	}

	/**
	 * This method update the database.
	 */
	public void update(Post obj) {
		sf.getCurrentSession().update(obj);		
	}

	/**
	 * This method insert data in the DataBase.
	 */
	public void insert(Post obj) {
		sf.getCurrentSession().save(obj);		
	}
	
	
}
