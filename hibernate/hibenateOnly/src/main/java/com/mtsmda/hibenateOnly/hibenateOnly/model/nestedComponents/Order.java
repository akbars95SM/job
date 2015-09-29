package com.mtsmda.hibenateOnly.hibenateOnly.model.nestedComponents;

public class Order {

	private Long id;
	private Contract weekdayContract;
	private Contract holidayContract;

	public Order() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Contract getWeekdayContract() {
		return weekdayContract;
	}

	public void setWeekdayContract(Contract weekdayContract) {
		this.weekdayContract = weekdayContract;
	}

	public Contract getHolidayContract() {
		return holidayContract;
	}

	public void setHolidayContract(Contract holidayContract) {
		this.holidayContract = holidayContract;
	}

}