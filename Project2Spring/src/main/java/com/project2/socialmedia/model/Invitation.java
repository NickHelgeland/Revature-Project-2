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
@Table(name = "invitation")
public class Invitation {
	
	@Id
	@Column(name="invitation_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long invitationid;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "sender", referencedColumnName="username")
	private User senders;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "receiver", referencedColumnName="username")
	private User receivers;
	
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
