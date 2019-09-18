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
import javax.persistence.OneToOne;

@Entity
@Table(name="friends")
public class Friends
{
	
	@Id
	@Column(name="friends_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long friendsid;
	
	@OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name = "person", referencedColumnName="userName")
	private Users person;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "friend", referencedColumnName="userName")
	private Users friend;
	
	public Friends() {}

	public Friends(Users friend1, Users friend2)
	{
		super();
		this.person = friend1;
		this.friend = friend2;
	}

	public Users getFriend2()
	{
		return friend;
	}

	public void setFriend2(Users friend2)
	{
		this.friend = friend2;
	}
	
	
}
