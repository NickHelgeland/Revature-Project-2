package com.project2.socialmedia.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * This class provide User and, the mapping with the database and also generate
 * the schema for the database.
 * @author Nick, Ilia, Danny, and Fausto.
 *
 */
@Entity
@Table(name="UserSM")
public class Users {
	@Id
	@Column(name="username")
	private String username;
	
	@Column(name = "password", nullable = false)
	private String password;
	
	@Column(name = "firstname", nullable = false)
	private String firstname;
	
	@Column(name = "lastname", nullable = false)
	private String lastname;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "address", nullable = false)
	private String address;
	
	@Column(name = "image_name")
	private String imageName;
	
	@OneToMany(mappedBy = "owner")
	private List<Post> postList;
	
	public Users() {
	}

	public Users(String userName, String passWord, String firstName, String lastName, String email, String address, String imageName) {		
		this.username = userName;
		this.password = passWord;
		this.firstname = firstName;
		this.lastname = lastName;
		this.email = email;
		this.address = address;
		this.imageName = imageName;
	}


	public Users(String userName, String passWord, String firstName, String lastName, String email, String address, String imageName, List<Post> postList) {		
		this.username = userName;
		this.password = passWord;
		this.firstname = firstName;
		this.lastname = lastName;
		this.email = email;
		this.address = address;
		this.imageName = imageName;
		this.postList = postList;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String userName) {
		this.username = userName;
	}

	public String getPassWord() {
		return password;
	}

	public void setPassWord(String passWord) {
		this.password = passWord;
	}

	public String getFirstName() {
		return firstname;
	}

	public void setFirstName(String firstName) {
		this.firstname = firstName;
	}

	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastName) {
		this.lastname = lastName;
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

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	@Override
	public String toString() {
		return "User [userName=" + username + ", passWord=" + password + ", firstName=" + firstname + ", lastName="
				+ lastname + ", email=" + email + ", address=" + address + ", postList=" + postList + "]";
	}

	
}
