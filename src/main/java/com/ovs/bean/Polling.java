package com.ovs.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Table_Poll")
public class Polling {
	
	@Id
	@Column(name="voterId")
	private String voterId;
	
	@Column(name="partyName")
	private String partyName;
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="userId")
	private Long userId;
	

	
	
	public Polling() {
		super();

	}

	public Polling(String voterId, String partyName, Long userId) {
		super();
		this.voterId = voterId;
		this.partyName = partyName;
		this.userId = userId;
		
	}

	public String getVoterId() {
		return voterId;
	}

	public void setVoterId(String voterId) {
		this.voterId = voterId;
	}

	public String getPartyName() {
		return partyName;
	}

	public void setPartyId(String partyName) {
		this.partyName = partyName;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	
	
	

}
