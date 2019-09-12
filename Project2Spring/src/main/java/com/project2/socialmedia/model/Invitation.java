package com.project2.socialmedia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "invitation")
public class Invitation {
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "username")
	List<User> senders;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "username")
	List<User> receivers;
	
	public Invitation() {}

	public Invitation(List<User> userList, List<User> receiverList)
	{
		super();
		this.senders = userList;
		this.receivers = receiverList;
	}

	public List<User> getUserList()
	{
		return senders;
	}

	public void setUserList(List<User> userList)
	{
		this.senders = userList;
	}

	public List<User> getReceiverList()
	{
		return receivers;
	}

	public void setReceiverList(List<User> receiverList)
	{
		this.receivers = receiverList;
	}
}
