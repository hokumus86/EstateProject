package com.hokumus.estate.main.java.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "stateadmin")
public class StateAdmin {

	
	private Long id;
	private Member memberId;
	private State stateId;
	@Id
	@SequenceGenerator(name = "sq_stateadmin",sequenceName = "sq_stateadmin")
	@GeneratedValue(generator ="sq_stateadmin",strategy = GenerationType.SEQUENCE)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@OneToOne
	@JoinColumn(name = "memberid")
	public Member getMemberId() {
		return memberId;
	}
	public void setMemberId(Member memberId) {
		this.memberId = memberId;
	}
	
	@OneToOne
	@JoinColumn(name = "stateid")
	public State getStateId() {
		return stateId;
	}
	public void setStateId(State stateId) {
		this.stateId = stateId;
	}
}
