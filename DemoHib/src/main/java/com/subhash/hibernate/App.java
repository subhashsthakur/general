package com.subhash.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Subhash");
		
		AlienSubhash objAlien = new AlienSubhash();
		objAlien.setAid(101);
		objAlien.setAname("Subhash");
		objAlien.setColor("Voilet");
		
		Configuration objCon = new Configuration().configure().addAnnotatedClass(AlienSubhash.class);
	
		
		SessionFactory sf = objCon.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(objAlien);
		session.getTransaction().commit();
		System.out.println("Alien Added");

	}

}
