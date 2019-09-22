package com.project2.socialmedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project2.socialmedia.dao.Insert;
import com.project2.socialmedia.model.Post;

@RestController
public class AddPostController 
{
	@Autowired
	private Insert<Post> postRepo;
	
	@CrossOrigin
	@PostMapping(value = "/addPost")
	public void addPost(@RequestBody Post post)
	{
		postRepo.insert(post);
	}
}
