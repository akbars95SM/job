package com.mtsmda.hibenateOnly.hibenateOnly.converter;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.AttributeConverter;

public class LocalDateConverter implements AttributeConverter<LocalDate, Date>{
	
	@Override
	public Date convertToDatabaseColumn(LocalDate attribute) {
		return null == attribute ? null : Date.valueOf(attribute);
	}
	
	@Override
	public LocalDate convertToEntityAttribute(Date dbData) {
		return null == dbData ? null : dbData.toLocalDate();
	}
	
}
