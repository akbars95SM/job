package com.mtsmda.jpa.jpa.hibernate;

import javax.persistence.EntityManager;

import com.mtsmda.jpa.jpa.hibernate.domain.Car;
import com.mtsmda.jpa.jpa.hibernate.domain.Contact;
import com.mtsmda.jpa.jpa.hibernate.domain.EmbeddedContact;
import com.mtsmda.jpa.jpa.hibernate.domain.OrderWithEmbeddedContact;
import com.mtsmda.jpa.jpa.hibernate.domain.Orders;
import com.mtsmda.jpa.jpa.hibernate.domain.OrdersNew;

public class Run {

	public static void main(String[] args) {
		EntityManager entityManager = HibernateJPAUtil.getEntityManager();
		entityManager.getTransaction().begin();

		Car car = new Car();
		car.setName("Car JPA");

		Orders orders = new Orders();
		orders.setHolidayAddress("holidayAddress");
		orders.setHolidayPhone("holidayPhone");
		orders.setHolidayRecipient("holidayRecipient");
		orders.setWeekdayAddress("weekdayAddress");
		orders.setWeekdayPhone("weekdayPhone");
		orders.setWeekdayRecipient("weekdayRecipient");

		entityManager.persist(car);
		entityManager.persist(orders);

		/* components */

		Contact contact = new Contact();
		contact.setAddress("address15");
		contact.setPhone("phone15");
		contact.setRecipient("recipient15");

		Contact contactHoliday = new Contact();
		contactHoliday.setAddress("addressHoliday");
		contactHoliday.setPhone("phoneHoliday");
		contactHoliday.setRecipient("recipientHoliday");

		OrdersNew ordersNew = new OrdersNew();
		ordersNew.setWeekdayContact(contact);
		ordersNew.setHolidayContact(contactHoliday);

		/*
		 * entityManager.persist(contact);
		 * entityManager.persist(contactHoliday);
		 */
		entityManager.persist(ordersNew);

		EmbeddedContact embeddedContact = new EmbeddedContact();
		embeddedContact.setAddress("address");
		embeddedContact.setPhone("phone");
		embeddedContact.setRecipient("recipient");

		EmbeddedContact embeddedContactHoliday = new EmbeddedContact();
		embeddedContactHoliday.setAddress("addressHoliday");
		embeddedContactHoliday.setPhone("phoneHoliday");
		embeddedContactHoliday.setRecipient("recipientHoliday");

		OrderWithEmbeddedContact orderWithEmbeddedContact = new OrderWithEmbeddedContact();
		orderWithEmbeddedContact.setEmbeddedContact(embeddedContact);
		orderWithEmbeddedContact.setEmbeddedContactHoliday(embeddedContactHoliday);

		entityManager.persist(orderWithEmbeddedContact);

		entityManager.getTransaction().commit();
		entityManager.close();
		System.exit(0);
	}

}