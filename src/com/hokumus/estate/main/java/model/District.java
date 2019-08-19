package com.hokumus.estate.main.java.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "district")
public class District {

	@Id
	private Long id;
	private String name;
	private Province provinceId;
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
	@OneToOne
	@JoinColumn(name = "provinceid")
	public Province getProvienceId() {
		return provinceId;
	}
	public void setProvienceId(Province provienceId) {
		this.provinceId = provienceId;
	}
}
