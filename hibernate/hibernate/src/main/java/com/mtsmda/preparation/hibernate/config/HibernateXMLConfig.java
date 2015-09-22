package com.mtsmda.preparation.hibernate.config;

import org.hibernate.cfg.Configuration;

public class HibernateXMLConfig {
	
	public static void main(String[] args) {
		
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
	}
	
}