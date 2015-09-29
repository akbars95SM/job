package com.mtsmda.jpa.jpa.hibernate.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OrderWithEmbeddedContact {

	@Id
	@GeneratedValue
	private Long id;

	@Embedded
	private EmbeddedContact embeddedContact;

	@Embedded
	@AttributeOverrides(value = { @AttributeOverride(name = "recipient", column = @Column(name = "recipientHoliday") ),
			@AttributeOverride(name = "phone", column = @Column(name = "phoneHoliday") ),
			@AttributeOverride(name = "address", column = @Column(name = "addressHoliday") ), })
	private EmbeddedContact embeddedContactHoliday;

	public OrderWithEmbeddedContact() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public EmbeddedContact getEmbeddedContact() {
		return embeddedContact;
	}

	public void setEmbeddedContact(EmbeddedContact embeddedContact) {
		this.embeddedContact = embeddedContact;
	}

	public EmbeddedContact getEmbeddedContactHoliday() {
		return embeddedContactHoliday;
	}

	public void setEmbeddedContactHoliday(EmbeddedContact embeddedContactHoliday) {
		this.embeddedContactHoliday = embeddedContactHoliday;
	}

}