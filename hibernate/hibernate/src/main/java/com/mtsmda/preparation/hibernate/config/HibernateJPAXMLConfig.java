package com.mtsmda.preparation.hibernate.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateJPAXMLConfig {
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MySQL_PU");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
	}
	
}