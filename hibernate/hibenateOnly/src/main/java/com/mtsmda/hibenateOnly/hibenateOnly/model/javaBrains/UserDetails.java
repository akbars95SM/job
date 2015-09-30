package com.mtsmda.hibenateOnly.hibenateOnly.model.javaBrains;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "user_details")
public class UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_details_id")
	private int userId;

	@Column(name = "user_details_name")
	private String userName;

	@Column(name = "user_details_joined_date")
	@Temporal(value = TemporalType.DATE)
	private Date joinedDate;

	@Column(name = "user_details_joined_date_time")
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date joinedDateTime;

	@Column(name = "user_details_joined_time")
	@Temporal(value = TemporalType.TIME)
	private Date joinedTime;

	@Lob
	@Column(name = "user_details_description")
	private String description;

	@Embedded
	@AttributeOverride(name = "street", column = @Column(name = "officce_address_street"))
	private Address address;

	@Embedded
	@AttributeOverrides(value = {
			@AttributeOverride(name = "street", column = @Column(name = "home_address_street")),
			@AttributeOverride(name = "city", column = @Column(name = "home_address_city")),
			@AttributeOverride(name = "state", column = @Column(name = "home_address_state")),
			@AttributeOverride(name = "pincode", column = @Column(name = "home_address_pincode"))
	})
	private Address homeAddress;

	public UserDetails() {

	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}

	public Date getJoinedDateTime() {
		return joinedDateTime;
	}

	public void setJoinedDateTime(Date joinedDateTime) {
		this.joinedDateTime = joinedDateTime;
	}

	public Date getJoinedTime() {
		return joinedTime;
	}

	public void setJoinedTime(Date joinedTime) {
		this.joinedTime = joinedTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + userId;
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
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
		UserDetails other = (UserDetails) obj;
		if (userId != other.userId)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", userName=" + userName + "]";
	}

}