package com.ovs.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Table_Elections")
public class Elections {
	
	@Id
	@Column(name="electionId")
	private Long electionId;
	
	@Column(name="electionName")
	private String electionName;
	
	@Column(name="partyName")
	private String partyName;
	
	@Column(name="date")
	private String date;

	
	public Elections() {
		super();

	}

	public Elections(Long electionId, String electionName, String partyName, String date) {
		super();
		this.electionId = electionId;
		this.electionName = electionName;
		this.partyName = partyName;
		this.date = date;
	}

	public Long getElectionId() {
		return electionId;
	}

	public void setElectionId(Long electionId) {
		this.electionId = electionId;
	}

	public String getElectionName() {
		return electionName;
	}

	public void setElectionName(String electionName) {
		this.electionName = electionName;
	}

	public String getPartyName() {
		return partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Elections [electionId=" + electionId + ", electionName=" + electionName + ", partyName=" + partyName
				+ ", date=" + date + "]";
	}
	
	
	
	

}
