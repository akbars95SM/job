package com.mtsmda.hibenateOnly.hibenateOnly;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import java.util.GregorianCalendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mtsmda.hibenateOnly.hibenateOnly.model.CarSequenceGeneration;
import com.mtsmda.hibenateOnly.hibenateOnly.model.CompositeKeyWithinEntity;
import com.mtsmda.hibenateOnly.hibenateOnly.model.CompositeKeyWithinEntityXML;
import com.mtsmda.hibenateOnly.hibenateOnly.model.FootballClub;
import com.mtsmda.hibenateOnly.hibenateOnly.model.Message;
import com.mtsmda.hibenateOnly.hibenateOnly.model.compositeID.Book;
import com.mtsmda.hibenateOnly.hibenateOnly.model.compositeID.ISBN;
import com.mtsmda.hibenateOnly.hibenateOnly.model.multiID.Employee;
import com.mtsmda.hibenateOnly.hibenateOnly.model.multiID.EmployeeXML;

public class Run {

	public static void main(String[] args) {
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();

			FootballClub footballClubBarcelona = new FootballClub();
			footballClubBarcelona.setFootballClubName("Barcelona");
			footballClubBarcelona.setSinceDate(LocalDate.of(1899, Month.NOVEMBER, 29));

			FootballClub footballClubRealMadrid = new FootballClub();
			footballClubRealMadrid.setFootballClubName("Real Madrid");
			footballClubRealMadrid.setSinceDate(LocalDate.of(1902, Month.MARCH, 6));

			Message message = new Message();
			message.setLocalDate(new Date(new java.util.Date().getTime()));
			message.setMessageText("Simple message");

			CompositeKeyWithinEntity compositeKeyWithinEntity = new CompositeKeyWithinEntity();
			compositeKeyWithinEntity.setId(1);
			compositeKeyWithinEntity.setDepartamentId(19);
			compositeKeyWithinEntity.setName("CompositeKeyWithinEntity");

			CompositeKeyWithinEntityXML compositeKeyWithinEntityXML = new CompositeKeyWithinEntityXML();
			compositeKeyWithinEntityXML.setDepartamentId(17);
			compositeKeyWithinEntityXML.setId(2);
			compositeKeyWithinEntityXML.setName("NAME");

			Employee employee = new Employee();
			employee.setIdCard(19);
			employee.setDepartament(21);
			employee.setName("NAME");

			/*
			 * EmployeeXML employeeXML = new EmployeeXML();
			 * employeeXML.setDepartament(19); employeeXML.setIdCard(7);
			 * employeeXML.setName("employeeXML");
			 */

			/*
			 * CarSequenceGeneration carSequenceGeneration = new
			 * CarSequenceGeneration(); carSequenceGeneration.setName("First");
			 * 
			 * CarSequenceGeneration carSequenceGeneration1 = new
			 * CarSequenceGeneration(); carSequenceGeneration.setName("Second");
			 */

			ISBN isbn = new ISBN();
			isbn.setCheckDigit(195);
			isbn.setGroup(93);
			isbn.setPublisher(4253);
			isbn.setTitleRef(205);

			Book book = new Book();
			book.setIsbn(isbn);
			book.setTitle("Java SE 8");

			session.beginTransaction();

			session.save(footballClubBarcelona);
			session.save(footballClubRealMadrid);

			session.save(message);

			session.save(compositeKeyWithinEntity);
			session.save(compositeKeyWithinEntityXML);

			session.save(employee);

			/* session.save(employeeXML); */

			/*session.save(book);*/

			/*
			 * org.hibernate.MappingException:
			 * org.hibernate.dialect.MySQLDialect does not support sequences
			 * session.save(carSequenceGeneration);
			 * session.save(carSequenceGeneration1);
			 */

			session.getTransaction().commit();

			// System.out.println(session.isConnected());
			session.close();
			// System.out.println(session.isConnected());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.exit(0);
		}

	}

}