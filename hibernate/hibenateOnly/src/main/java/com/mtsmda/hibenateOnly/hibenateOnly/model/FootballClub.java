package com.mtsmda.hibenateOnly.hibenateOnly.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mtsmda.hibenateOnly.hibenateOnly.converter.LocalDateConverter;

@Entity
@Table(name = "FOOTBALL_CLUB")
public class FootballClub implements Serializable {

	private static final long serialVersionUID = 1597669692029181875L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "FOOTBALL_CLUB_ID", nullable = false, unique = true)
	private Integer id;

	@Column(name = "FOOTBALL_CLUB_NAME", nullable = false, unique = true)
	private String footballClubName;

	@Column(name = "FOOTBALL_CLUB_SINCE_DATE", nullable = false)
	@Convert(converter = LocalDateConverter.class)
	private LocalDate sinceDate;

	public FootballClub() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFootballClubName() {
		return footballClubName;
	}

	public void setFootballClubName(String footballClubName) {
		this.footballClubName = footballClubName;
	}

	public LocalDate getSinceDate() {
		return sinceDate;
	}

	public void setSinceDate(LocalDate sinceDate) {
		this.sinceDate = sinceDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((footballClubName == null) ? 0 : footballClubName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((sinceDate == null) ? 0 : sinceDate.hashCode());
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
		FootballClub other = (FootballClub) obj;
		if (footballClubName == null) {
			if (other.footballClubName != null)
				return false;
		} else if (!footballClubName.equals(other.footballClubName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (sinceDate == null) {
			if (other.sinceDate != null)
				return false;
		} else if (!sinceDate.equals(other.sinceDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FootballClub [id=" + id + ", footballClubName=" + footballClubName + ", sinceDate=" + sinceDate + "]";
	}

}