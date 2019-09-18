package com.project2.socialmedia.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
	@JoinColumn(name = "senders", referencedColumnName="username")
	private Users senders;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "receiver", referencedColumnName="username")
	private Users receiver;
	
	public Invitation() {}	
	

	public Invitation(Users senders, Users receivers) {
		super();
		this.senders = senders;
		this.receiver = receivers;
	}


	public Users getSenders() {
		return senders;
	}

	public void setSenders(Users senders) {
		this.senders = senders;
	}

	public Users getReceivers() {
		return receiver;
	}

	public void setReceivers(Users receivers) {
		this.receiver = receivers;
	}


	@Override
	public String toString() {
		return "Invitation [senders=" + senders + ", receiver=" + receiver + "]";
	}	
}
