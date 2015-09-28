package com.mtsmda.jpa.jpa.hibernate;

import javax.persistence.EntityManager;

import com.mtsmda.jpa.jpa.hibernate.domain.Car;

public class Run {

	public static void main(String[] args) {
		EntityManager entityManager = HibernateJPAUtil.getEntityManager();
		entityManager.getTransaction().begin();

		Car car = new Car();
		car.setName("Car JPA");

		entityManager.persist(car);

		entityManager.getTransaction().commit();
		entityManager.close();
	}

}