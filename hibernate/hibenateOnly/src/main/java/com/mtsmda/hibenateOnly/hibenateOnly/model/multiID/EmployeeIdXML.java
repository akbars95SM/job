package com.mtsmda.hibenateOnly.hibenateOnly.model.multiID;

import java.io.Serializable;

public class EmployeeIdXML implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer departament;
	private Integer idCard;

	public EmployeeIdXML() {

	}

	public Integer getDepartament() {
		return departament;
	}

	public void setDepartament(Integer departament) {
		this.departament = departament;
	}

	public Integer getIdCard() {
		return idCard;
	}

	public void setIdCard(Integer idCard) {
		this.idCard = idCard;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departament == null) ? 0 : departament.hashCode());
		result = prime * result + ((idCard == null) ? 0 : idCard.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeIdXML other = (EmployeeIdXML) obj;
		if (departament == null) {
			if (other.departament != null)
				return false;
		} else if (!departament.equals(other.departament))
			return false;
		if (idCard == null) {
			if (other.idCard != null)
				return false;
		} else if (!idCard.equals(other.idCard))
			return false;
		return true;
	}

}