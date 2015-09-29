package com.mtsmda.hibenateOnly.hibenateOnly.model.referenceComponents;

import javax.persistence.Embeddable;

import org.hibernate.annotations.Parent;

@Embeddable
public class Contract {

	@Parent
	private Order order;
	private String recipient;
	private String address;
	private Phone phone;

	public Contract() {

	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

}