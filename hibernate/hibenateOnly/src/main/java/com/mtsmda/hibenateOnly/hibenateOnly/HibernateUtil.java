package com.mtsmda.hibenateOnly.hibenateOnly;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.mtsmda.hibenateOnly.hibenateOnly.model.FootballClub;

public class HibernateUtil {

	private static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			configuration();
		}
		return sessionFactory;
	}

	private static void configuration() {
		/*
		 * Properties properties = new Properties();
		 * properties.setProperty("hibernate.dialect",
		 * "org.hibernate.dialect.MySQLDialect");
		 * properties.setProperty("hibernate.connection.driver_class",
		 * "com.mysql.jdbc.Driver");
		 * properties.setProperty("hibernate.connection.url",
		 * "jdbc:mysql://localhost:3306/SampleDB");
		 * properties.setProperty("hibernate.connection.username", "root");
		 * properties.setProperty("hibernate.connection.password", "root");
		 */

		// Configuration configuration = new
		// Configuration().addClass(FootballClub.class).addProperties(properties);
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		configuration.addResource("Message.hbm.xml");
		configuration.addResource("CompositeKeyWithinEntityXML.hbm.xml");
		configuration.addResource("Order.hbm.xml").addResource("Customer.hbm.xml").addResource("OrderMap.hbm.xml");

		/*
		 * not working configuration.addResource("EmployeeXML.hbm.xml");
		 */

		/*
		 * configuration.addProperties(properties);
		 * configuration.addClass(com.mtsmda.hibenateOnly.hibenateOnly.model.
		 * FootballClub.class);
		 */

		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	}

}