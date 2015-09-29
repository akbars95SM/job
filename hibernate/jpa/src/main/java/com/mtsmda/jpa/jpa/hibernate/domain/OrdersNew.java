package com.mtsmda.jpa.jpa.hibernate.domain;

public class OrdersNew {

	private Long id;
	private Contact weekdayContact;
	private Contact holidayContact;

	public OrdersNew() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Contact getWeekdayContact() {
		return weekdayContact;
	}

	public void setWeekdayContact(Contact weekdayContact) {
		this.weekdayContact = weekdayContact;
	}

	public Contact getHolidayContact() {
		return holidayContact;
	}

	public void setHolidayContact(Contact holidayContact) {
		this.holidayContact = holidayContact;
	}

}