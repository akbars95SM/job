package com.mtsmda.jpa.jpa.hibernate.domain;

public class Orders {

	private Long id;
	private String weekdayRecipient;
	private String weekdayPhone;
	private String weekdayAddress;
	private String holidayRecipient;
	private String holidayPhone;
	private String holidayAddress;

	public Orders() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getWeekdayRecipient() {
		return weekdayRecipient;
	}

	public void setWeekdayRecipient(String weekdayRecipient) {
		this.weekdayRecipient = weekdayRecipient;
	}

	public String getWeekdayPhone() {
		return weekdayPhone;
	}

	public void setWeekdayPhone(String weekdayPhone) {
		this.weekdayPhone = weekdayPhone;
	}

	public String getWeekdayAddress() {
		return weekdayAddress;
	}

	public void setWeekdayAddress(String weekdayAddress) {
		this.weekdayAddress = weekdayAddress;
	}

	public String getHolidayRecipient() {
		return holidayRecipient;
	}

	public void setHolidayRecipient(String holidayRecipient) {
		this.holidayRecipient = holidayRecipient;
	}

	public String getHolidayPhone() {
		return holidayPhone;
	}

	public void setHolidayPhone(String holidayPhone) {
		this.holidayPhone = holidayPhone;
	}

	public String getHolidayAddress() {
		return holidayAddress;
	}

	public void setHolidayAddress(String holidayAddress) {
		this.holidayAddress = holidayAddress;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((holidayAddress == null) ? 0 : holidayAddress.hashCode());
		result = prime * result + ((holidayPhone == null) ? 0 : holidayPhone.hashCode());
		result = prime * result + ((holidayRecipient == null) ? 0 : holidayRecipient.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((weekdayAddress == null) ? 0 : weekdayAddress.hashCode());
		result = prime * result + ((weekdayPhone == null) ? 0 : weekdayPhone.hashCode());
		result = prime * result + ((weekdayRecipient == null) ? 0 : weekdayRecipient.hashCode());
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
		Orders other = (Orders) obj;
		if (holidayAddress == null) {
			if (other.holidayAddress != null)
				return false;
		} else if (!holidayAddress.equals(other.holidayAddress))
			return false;
		if (holidayPhone == null) {
			if (other.holidayPhone != null)
				return false;
		} else if (!holidayPhone.equals(other.holidayPhone))
			return false;
		if (holidayRecipient == null) {
			if (other.holidayRecipient != null)
				return false;
		} else if (!holidayRecipient.equals(other.holidayRecipient))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (weekdayAddress == null) {
			if (other.weekdayAddress != null)
				return false;
		} else if (!weekdayAddress.equals(other.weekdayAddress))
			return false;
		if (weekdayPhone == null) {
			if (other.weekdayPhone != null)
				return false;
		} else if (!weekdayPhone.equals(other.weekdayPhone))
			return false;
		if (weekdayRecipient == null) {
			if (other.weekdayRecipient != null)
				return false;
		} else if (!weekdayRecipient.equals(other.weekdayRecipient))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", weekdayRecipient=" + weekdayRecipient + ", weekdayPhone=" + weekdayPhone
				+ ", weekdayAddress=" + weekdayAddress + ", holidayRecipient=" + holidayRecipient + ", holidayPhone="
				+ holidayPhone + ", holidayAddress=" + holidayAddress + "]";
	}

}