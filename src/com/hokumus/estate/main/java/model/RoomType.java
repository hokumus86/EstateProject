package com.hokumus.estate.main.java.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "roomtype")
public class RoomType {

	private Long id;
	private String name;
	private String distcription;

	@Id
	@SequenceGenerator(name = "sq_roomtype", sequenceName = "sq_roomtype")
	@GeneratedValue(generator = "sq_roomtype", strategy = GenerationType.SEQUENCE)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDistcription() {
		return distcription;
	}

	public void setDistcription(String distcription) {
		this.distcription = distcription;
	}

}
