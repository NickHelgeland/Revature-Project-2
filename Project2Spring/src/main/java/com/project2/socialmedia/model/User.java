package com.project2.socialmedia.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="userSM")
public class User {
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
	
	@OneToMany(mappedBy = "senders", fetch = FetchType.LAZY)
	private List<Invitation> senderList;
	
	@OneToMany(mappedBy = "receivers", fetch = FetchType.LAZY)
	private List<Invitation> receiverList;
	
	@OneToMany(mappedBy = "owner", fetch = FetchType.LAZY)
	private List<Post> postList;
	
	@OneToMany(mappedBy = "friend1", fetch = FetchType.LAZY)
	private List<Friends> frind1List;
	
	@OneToMany(mappedBy = "friend2", fetch = FetchType.LAZY )
	private List<Friends> friend2List;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String userName, String passWord, String firstName, String lastName, String email, String address) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
	}


	public User(String userName, String passWord, String firstName, String lastName, String email, String address,
			List<Invitation> senderList, List<Invitation> receiverList, List<Post> postList, List<Friends> frind1List,
			List<Friends> friend2List) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
		this.senderList = senderList;
		this.receiverList = receiverList;
		this.postList = postList;
		this.frind1List = frind1List;
		this.friend2List = friend2List;
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

	public List<Invitation> getSenderList() {
		return senderList;
	}

	public void setSenderList(List<Invitation> senderList) {
		this.senderList = senderList;
	}

	public List<Invitation> getReceiverList() {
		return receiverList;
	}

	public void setReceiverList(List<Invitation> receiverList) {
		this.receiverList = receiverList;
	}

	public List<Post> getPostList() {
		return postList;
	}

	public void setPostList(List<Post> postList) {
		this.postList = postList;
	}

	public List<Friends> getFrind1List() {
		return frind1List;
	}

	public void setFrind1List(List<Friends> frind1List) {
		this.frind1List = frind1List;
	}

	public List<Friends> getFriend2List() {
		return friend2List;
	}

	public void setFriend2List(List<Friends> friend2List) {
		this.friend2List = friend2List;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", passWord=" + passWord + ", firstName=" + firstName + ", lastName="
				+ lastName + ", email=" + email + ", address=" + address + ", senderList=" + senderList
				+ ", receiverList=" + receiverList + ", postList=" + postList + ", frind1List=" + frind1List
				+ ", friend2List=" + friend2List + "]";
	}

	
}
