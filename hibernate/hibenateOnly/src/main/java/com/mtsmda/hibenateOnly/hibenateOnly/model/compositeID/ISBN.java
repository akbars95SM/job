package com.mtsmda.hibenateOnly.hibenateOnly.model.compositeID;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ISBN implements Serializable {

	private static final long serialVersionUID = 1L;

	private int group;
	private int publisher;
	private int titleRef;
	private int checkDigit;

	public ISBN() {

	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public int getPublisher() {
		return publisher;
	}

	public void setPublisher(int publisher) {
		this.publisher = publisher;
	}

	public int getTitleRef() {
		return titleRef;
	}

	public void setTitleRef(int titleRef) {
		this.titleRef = titleRef;
	}

	public int getCheckDigit() {
		return checkDigit;
	}

	public void setCheckDigit(int checkDigit) {
		this.checkDigit = checkDigit;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + checkDigit;
		result = prime * result + group;
		result = prime * result + publisher;
		result = prime * result + titleRef;
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
		ISBN other = (ISBN) obj;
		if (checkDigit != other.checkDigit)
			return false;
		if (group != other.group)
			return false;
		if (publisher != other.publisher)
			return false;
		if (titleRef != other.titleRef)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ISBN [group=" + group + ", publisher=" + publisher + ", titleRef=" + titleRef + ", checkDigit="
				+ checkDigit + "]";
	}

}
