package com.ovs.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;

import jakarta.persistence.Table;


@Entity
@Table(name = "Table_Party")
public class Party {

	@Id

	@Column(name = "partyId")
	private Long partyId;

	@Column(name = "partyName")
	private String partyName;

	@Column(name = "partySymbol")
	private String partySymbol;

	public Party() {
		super();

	}

	public Party(Long partyId, String partyName, String partySymbol) {
		super();
		this.partyId = partyId;
		this.partyName = partyName;
		this.partySymbol = partySymbol;
	}

	public Long getPartyId() {
		return partyId;
	}

	public void setPartyId(Long partyId) {
		this.partyId = partyId;
	}

	public String getpartyName() {
		return partyName;
	}

	public void setpartyName(String partyName) {
		this.partyName = partyName;
	}

	public String getPartySymbol() {
		return partySymbol;
	}

	public void setPartySymbol(String partySymbol) {
		this.partySymbol = partySymbol;
	}

	@Override
	public String toString() {
		return "Party [partyId=" + partyId + ", partyName=" + partyName + ", partySymbol=" + partySymbol + "]";
	}

}
