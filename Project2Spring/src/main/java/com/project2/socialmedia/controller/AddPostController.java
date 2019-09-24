package com.project2.socialmedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project2.socialmedia.dao.Insert;
import com.project2.socialmedia.dao.UserDAO;
import com.project2.socialmedia.model.Post;
import com.project2.socialmedia.response.NewPost;

@RestController
public class AddPostController 
{
	@Autowired
	private Insert<Post> postRepo;
	
	@Autowired
	private UserDAO userRepo;
	
	@CrossOrigin
	@PostMapping(value = "/addPost")
	public void addPost(@RequestBody NewPost newPost)
	{
		Post post = new Post(newPost.getContent(), userRepo.selectOne(newPost.getUsername()));
		
		postRepo.insert(post);
	}
}
