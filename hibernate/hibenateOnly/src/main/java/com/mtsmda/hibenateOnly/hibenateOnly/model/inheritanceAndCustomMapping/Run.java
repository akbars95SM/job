package com.mtsmda.hibenateOnly.hibenateOnly.model.inheritanceAndCustomMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mtsmda.hibenateOnly.hibenateOnly.HibernateUtil;
import com.mtsmda.hibenateOnly.hibenateOnly.model.inheritanceAndCustomMapping.tablePerClassHirerchy.AudioDisc;
import com.mtsmda.hibenateOnly.hibenateOnly.model.inheritanceAndCustomMapping.tablePerClassHirerchy.Disc;
import com.mtsmda.hibenateOnly.hibenateOnly.model.inheritanceAndCustomMapping.tablePerClassHirerchy.VideoDisc;
import com.mtsmda.hibenateOnly.hibenateOnly.model.inheritanceAndCustomMapping.tablePerClassWithMappedSurepclass.AudioDisc4;
import com.mtsmda.hibenateOnly.hibenateOnly.model.inheritanceAndCustomMapping.tablePerClassWithMappedSurepclass.Disc4;
import com.mtsmda.hibenateOnly.hibenateOnly.model.inheritanceAndCustomMapping.tablePerClassWithMappedSurepclass.VideoDisc4;
import com.mtsmda.hibenateOnly.hibenateOnly.model.inheritanceAndCustomMapping.tablePerConcreteClass.AudioDisc3;
import com.mtsmda.hibenateOnly.hibenateOnly.model.inheritanceAndCustomMapping.tablePerConcreteClass.Disc3;
import com.mtsmda.hibenateOnly.hibenateOnly.model.inheritanceAndCustomMapping.tablePerConcreteClass.VideoDisc3;
import com.mtsmda.hibenateOnly.hibenateOnly.model.inheritanceAndCustomMapping.tablePerSubclass.AudioDisc2;
import com.mtsmda.hibenateOnly.hibenateOnly.model.inheritanceAndCustomMapping.tablePerSubclass.Disc2;
import com.mtsmda.hibenateOnly.hibenateOnly.model.inheritanceAndCustomMapping.tablePerSubclass.VideoDisc2;

public class Run {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = null;
		try {
			
			session = sessionFactory.openSession();

			Disc disc = new Disc();
			disc.setName("First disc name");
			disc.setPrice(100);

			AudioDisc audioDisc = new AudioDisc();
			audioDisc.setName("First audio disc");
			audioDisc.setPrice(110);
			audioDisc.setTrackCount(17);
			audioDisc.setArtist("Lyube");

			VideoDisc videoDisc = new VideoDisc();
			videoDisc.setDirector("director");
			videoDisc.setLanguage("English");
			videoDisc.setName("name");
			videoDisc.setPrice(19);
			
			/**/
			Disc2 disc2 = new Disc2();
			disc2.setName("First disc name");
			disc2.setPrice(100);
			
			AudioDisc2 audioDisc2 = new AudioDisc2();
			audioDisc2.setName("First audio disc");
			audioDisc2.setPrice(110);
			audioDisc2.setTrackCount(17);
			audioDisc2.setArtist("Lyube");

			VideoDisc2 videoDisc2 = new VideoDisc2();
			videoDisc2.setDirector("director");
			videoDisc2.setLanguage("English");
			videoDisc2.setName("name");
			videoDisc2.setPrice(19);
			
			
			/**/
			Disc3 disc3 = new Disc3();
			disc3.setName("First disc name");
			disc3.setPrice(100);


			Disc3 disc31 = new Disc3();
			disc31.setName("First disc name1");
			disc31.setPrice(1001);
			
			AudioDisc3 audioDisc3 = new AudioDisc3();
			audioDisc3.setName("First audio disc");
			audioDisc3.setPrice(110);
			audioDisc3.setTrackCount(17);
			audioDisc3.setArtist("Lyube");

			VideoDisc3 videoDisc3 = new VideoDisc3();
			videoDisc3.setDirector("director");
			videoDisc3.setLanguage("English");
			videoDisc3.setName("name");
			videoDisc3.setPrice(19);
			
			VideoDisc3 videoDisc31 = new VideoDisc3();
			videoDisc31.setDirector("director1");
			videoDisc31.setLanguage("English1");
			videoDisc31.setName("name1");
			videoDisc31.setPrice(191);
			
			/**
			 * */
			
			AudioDisc4 audioDisc4 = new AudioDisc4();
			audioDisc4.setName("First audio disc");
			audioDisc4.setPrice(110);
			audioDisc4.setTrackCount(17);
			audioDisc4.setArtist("Lyube");

			VideoDisc4 videoDisc4 = new VideoDisc4();
			videoDisc4.setDirector("director");
			videoDisc4.setLanguage("English");
			videoDisc4.setName("name");
			videoDisc4.setPrice(19);


			session.getTransaction().begin();

			session.save(disc);
			session.save(audioDisc);
			session.save(videoDisc);
			
			session.save(disc2);
			session.save(audioDisc2);
			session.save(videoDisc2);
			
			session.save(disc3);
			session.save(disc31);
			session.save(audioDisc3);
			session.save(videoDisc3);
			session.save(videoDisc31);

			session.save(audioDisc4);
			session.save(videoDisc4);
			
			
			session.getTransaction().commit();
			
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			System.exit(0);
		}
	}

}
