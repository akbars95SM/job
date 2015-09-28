package com.mtsmda.hibenateOnly.hibenateOnly.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CompositeKeyWithinEntityXML implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private Integer departamentId;
	private String name;

	public CompositeKeyWithinEntityXML() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDepartamentId() {
		return departamentId;
	}

	public void setDepartamentId(Integer departamentId) {
		this.departamentId = departamentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}