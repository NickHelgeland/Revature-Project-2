package com.project2.socialmedia.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="friends")
public class Friends
{
	@JoinColumn(name = "friend1")
	private User friend1;
	
	@JoinColumn(name = "friend2")
	private User friend2;
	
	public Friends() {}

	public Friends(User friend1, User friend2)
	{
		super();
		this.friend1 = friend1;
		this.friend2 = friend2;
	}

	public User getFriend1()
	{
		return friend1;
	}

	public void setFriend1(User friend1)
	{
		this.friend1 = friend1;
	}

	public User getFriend2()
	{
		return friend2;
	}

	public void setFriend2(User friend2)
	{
		this.friend2 = friend2;
	}
	
	
}
