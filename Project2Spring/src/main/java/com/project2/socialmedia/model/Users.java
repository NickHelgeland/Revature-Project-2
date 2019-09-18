package com.project2.socialmedia.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="UserSM")
public class Users {
	@Id
	@Column(name="username")
	private String userName;
	
	@Column(name = "password", nullable = false)
	private String passWord;
	
	@Column(name = "firstname", nullable = false)
	private String firstName;
	
	@Column(name = "lastname", nullable = false)
	private String lastName;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "address", nullable = false)
	private String address;
	
	@OneToMany(mappedBy = "owner")
	private List<Post> postList;
	
	@OneToMany(mappedBy = "person")
	private List<Friends> friendList;
	
	@OneToMany(mappedBy = "senders")
	private List<Invitation> invList;
	
	public Users() {
	}

	public Users(String userName, String passWord, String firstName, String lastName, String email, String address) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
	}


	public Users(String userName, String passWord, String firstName, String lastName, String email, String address,
			List<Invitation> senderList, List<Invitation> receiverList, List<Post> postList, List<Friends> frind1List,
			List<Friends> friend2List) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
		this.postList = postList;
		this.friendList = friend2List;
	}



	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Post> getPostList() {
		return postList;
	}

	public void setPostList(List<Post> postList) {
		this.postList = postList;
	}

	public List<Friends> getFriendList() {
		return friendList;
	}

	public void setFriendList(List<Friends> friendList) {
		this.friendList = friendList;
	}

	public List<Invitation> getInvList() {
		return invList;
	}

	public void setInvList(List<Invitation> invList) {
		this.invList = invList;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", passWord=" + passWord + ", firstName=" + firstName + ", lastName="
				+ lastName + ", email=" + email + ", address=" + address + ", postList=" + postList + ", friendList=" + friendList + "]";
	}

	
}
