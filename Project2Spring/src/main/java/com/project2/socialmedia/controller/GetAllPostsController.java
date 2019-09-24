package com.project2.socialmedia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project2.socialmedia.dao.Select;
import com.project2.socialmedia.model.Post;
/**
 * This class is a restful to save data in post table.
 * @author Nick, Ilia, Danny and Fausto.
 *
 */
@RestController
public class GetAllPostsController 
{
	@Autowired
	Select<Post> postRepo;
	
	@CrossOrigin
	@GetMapping(value = "/getAllPosts")
	public List<Post> getAllPosts()
	{
		return postRepo.selectAll();
	}
}
