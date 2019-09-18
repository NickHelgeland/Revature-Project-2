package com.project2.socialmedia.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="post")
public class Post
{
	@Id
	@Column(name="post_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long postId;
	
	@Column(name = "content", nullable = false)
	private String content;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "username")
	private Users owner;

	public Post(long postId, String content, Users username)
	{
		super();
		this.postId = postId;
		this.content = content;
		this.owner = username;
	}
	
	public Post() {}

	public long getPostId()
	{
		return postId;
	}

	public void setPostId(long postId)
	{
		this.postId = postId;
	}

	public String getContent()
	{
		return content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	@Override
	public String toString()
	{
		return "Post [postId=" + postId + ", content=" + content + ", username=" + owner + "]";
	}
}
