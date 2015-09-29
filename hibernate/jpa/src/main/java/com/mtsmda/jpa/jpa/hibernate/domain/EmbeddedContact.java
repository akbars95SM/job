package com.mtsmda.jpa.jpa.hibernate.domain;

import javax.persistence.Embeddable;

@Embeddable
public class EmbeddedContact {

	private String recipient;
	private String phone;
	private String address;

	public EmbeddedContact() {

	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}