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
	User senders;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "username")
	User receivers;
	
	public Invitation() {}	
	

	public Invitation(User senders, User receivers) {
		super();
		this.senders = senders;
		this.receivers = receivers;
	}


	public User getSenders() {
		return senders;
	}

	public void setSenders(User senders) {
		this.senders = senders;
	}

	public User getReceivers() {
		return receivers;
	}

	public void setReceivers(User receivers) {
		this.receivers = receivers;
	}


	@Override
	public String toString() {
		return "Invitation [senders=" + senders + ", receivers=" + receivers + "]";
	}	
}
