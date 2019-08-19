package com.hokumus.estate.main.java.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estatetype")
public class EmlakTuru {

	private Long id;
	private String tip;

	@Id
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "type")
	public String getType() {
		return tip;
	}

	public void setType(String type) {
		this.tip = type;
	}

}
