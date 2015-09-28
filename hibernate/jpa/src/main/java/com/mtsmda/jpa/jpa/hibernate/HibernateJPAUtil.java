package com.mtsmda.jpa.jpa.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateJPAUtil {

	private static EntityManager entityManager = null;

	public static EntityManager getEntityManager() {
		if (entityManager == null) {
			configuration();
		}
		return entityManager;
	}

	private static void configuration() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MySQL_PU");
		entityManager = entityManagerFactory.createEntityManager();
	}

}