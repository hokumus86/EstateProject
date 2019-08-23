package com.hokumus.estate.main.java.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "estatetype")
public class EstateTypes {

	private Long id;
	private String tip;

	@Id
	@SequenceGenerator(name = "sq_estatetype",sequenceName = "sq_estatetype")
	@GeneratedValue(generator ="sq_estatetype",strategy = GenerationType.SEQUENCE)
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
