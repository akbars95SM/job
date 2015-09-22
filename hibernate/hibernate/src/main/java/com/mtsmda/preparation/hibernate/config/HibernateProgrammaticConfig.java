package com.mtsmda.preparation.hibernate.config;

import java.io.File;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.mtsmda.preparation.hibernate.hibernate.Message;

public class HibernateProgrammaticConfig {
	
	public static void main(String[] args) {
		
		Configuration configuration = new Configuration().addResource("Book.hbm.xml") //or
				//.addClass(Message.class) or
				//.addJar(new File("mapping.jar")) or
				.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect")
				.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver")
				.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/SampleDB")
				.setProperty("hibernate.connection.username", "root")
				.setProperty("hibernate.connection.password", "root");
		
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		SessionFactory buildSessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
		
	}
	
}