package com.mtsmda.hibenateOnly.hibenateOnly;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mtsmda.hibenateOnly.hibenateOnly.model.CarSequenceGeneration;
import com.mtsmda.hibenateOnly.hibenateOnly.model.CompositeKeyWithinEntity;
import com.mtsmda.hibenateOnly.hibenateOnly.model.CompositeKeyWithinEntityXML;
import com.mtsmda.hibenateOnly.hibenateOnly.model.FootballClub;
import com.mtsmda.hibenateOnly.hibenateOnly.model.Message;
import com.mtsmda.hibenateOnly.hibenateOnly.model.compositeID.Book;
import com.mtsmda.hibenateOnly.hibenateOnly.model.compositeID.ISBN;
import com.mtsmda.hibenateOnly.hibenateOnly.model.javaBrains.UserDetails;
import com.mtsmda.hibenateOnly.hibenateOnly.model.keysMap.OrderMap;
import com.mtsmda.hibenateOnly.hibenateOnly.model.keysMap.Period;
import com.mtsmda.hibenateOnly.hibenateOnly.model.mappingCollectionComponents.Address;
import com.mtsmda.hibenateOnly.hibenateOnly.model.mappingCollectionComponents.Customer;
import com.mtsmda.hibenateOnly.hibenateOnly.model.mappingCollectionComponentsXML.AddressXML;
import com.mtsmda.hibenateOnly.hibenateOnly.model.mappingCollectionComponentsXML.CustomerXML;
import com.mtsmda.hibenateOnly.hibenateOnly.model.multiID.Employee;
import com.mtsmda.hibenateOnly.hibenateOnly.model.multiID.EmployeeXML;
import com.mtsmda.hibenateOnly.hibenateOnly.model.nestedComponents.Contract;
import com.mtsmda.hibenateOnly.hibenateOnly.model.nestedComponents.Order;
import com.mtsmda.hibenateOnly.hibenateOnly.model.nestedComponents.Phone;

import antlr.collections.List;

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

			/*
			 * session.save(footballClubBarcelona);
			 * session.save(footballClubRealMadrid);
			 * 
			 * session.save(message);
			 * 
			 * session.save(compositeKeyWithinEntity);
			 * session.save(compositeKeyWithinEntityXML);
			 * 
			 * session.save(employee);
			 */

			/* session.save(employeeXML); */

			/* session.save(book); */

			/*
			 * org.hibernate.MappingException:
			 * org.hibernate.dialect.MySQLDialect does not support sequences
			 * session.save(carSequenceGeneration);
			 * session.save(carSequenceGeneration1);
			 */

			/* nested components */
			Phone phoneOrange = new Phone();
			phoneOrange.setExchange(0);
			phoneOrange.setAreaCode(69);
			phoneOrange.setAreaCode(123456);

			Phone phoneMoldcell = new Phone();
			phoneMoldcell.setExchange(0);
			phoneMoldcell.setAreaCode(79);
			phoneMoldcell.setAreaCode(654132);

			Contract contractWeekday = new Contract();
			contractWeekday.setAddress("address");
			contractWeekday.setName("name");
			contractWeekday.setPhone(phoneMoldcell);

			Contract contractHoliday = new Contract();
			contractHoliday.setAddress("addressHoliday");
			contractHoliday.setName("nameHoliday");
			contractHoliday.setPhone(phoneOrange);

			Order order = new Order();
			order.setHolidayContract(contractHoliday);
			order.setWeekdayContract(contractWeekday);

			session.save(order);

			/* reference components */

			/* mapping collection components */
			Customer customer = new Customer();
			customer.setName("Ivanov");

			Address address1 = new Address();
			address1.setAddress("address");
			address1.setCity("city");
			address1.setState("state");
			address1.setZip("zip");
			address1.setCustomer(customer);

			Address address2 = new Address();
			address2.setAddress("address12");
			address2.setCity("city12");
			address2.setState("state12");
			address2.setZip("zip12");
			address2.setCustomer(customer);

			customer.getContacts().add(address1);
			customer.getContacts().add(address2);

			session.save(customer);

			/* xml */
			CustomerXML customerXML = new CustomerXML();
			customerXML.setName("Ivanov");

			AddressXML address = new AddressXML();
			address.setAddress("address");
			address.setCity("city");
			address.setState("state");
			address.setZip("zip");
			address.setCustomer(customerXML);

			customerXML.getContacts().add(address);

			session.save(customerXML);

			/* keys Map */

			OrderMap orderMap = new OrderMap();
			orderMap.setName("First");

			com.mtsmda.hibenateOnly.hibenateOnly.model.keysMap.Contract contract = new com.mtsmda.hibenateOnly.hibenateOnly.model.keysMap.Contract();
			contract.setAddress("address");
			contract.setName("name");

			Period period = new Period();
			period.setStartDate(new Date(new java.util.Date().getTime()));
			period.setEndDate(new Date(new java.util.Date().getTime()));

			Map<Period, com.mtsmda.hibenateOnly.hibenateOnly.model.keysMap.Contract> map = new HashMap<>();
			map.put(period, contract);

			orderMap.setMap(map);

			session.save(orderMap);

			/* java brains */
			UserDetails userDetails = new UserDetails();
			userDetails.setUserName("Ivanov");
			userDetails.setJoinedDate(new java.util.Date());
			userDetails.setJoinedDateTime(new java.util.Date());
			userDetails.setJoinedTime(new java.util.Date());
			userDetails.setDescription("ewrfwfwgerg 34tifg 90greg ");

			com.mtsmda.hibenateOnly.hibenateOnly.model.javaBrains.Address addressJB = new com.mtsmda.hibenateOnly.hibenateOnly.model.javaBrains.Address();
			addressJB.setCity("Kishinev");
			addressJB.setPincode("2935");
			addressJB.setState("Kishinev");
			addressJB.setStreet("Pushkin");

			com.mtsmda.hibenateOnly.hibenateOnly.model.javaBrains.Address addressJBHome = new com.mtsmda.hibenateOnly.hibenateOnly.model.javaBrains.Address();
			addressJBHome.setCity("Kishinev");
			addressJBHome.setPincode("3529");
			addressJBHome.setState("Kishinev");
			addressJBHome.setStreet("Stefan cel Mare");

			userDetails.setAddress(addressJB);
			userDetails.setHomeAddress(addressJBHome);

			session.save(userDetails);

			session.getTransaction().commit();

			// System.out.println(session.isConnected());
			session.close();
			// System.out.println(session.isConnected());

			System.out.println();

			Session openSession = sessionFactory.openSession();
			openSession.beginTransaction();

			Object object = openSession.get(UserDetails.class, 1);
			System.out.println(object);
			System.out.println(object.getClass().getCanonicalName());
			System.out.println(object.getClass().isAssignableFrom(UserDetails.class));
			System.out.println(object.getClass().isAssignableFrom(Contract.class));

			openSession.close();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.exit(0);
		}

	}

}