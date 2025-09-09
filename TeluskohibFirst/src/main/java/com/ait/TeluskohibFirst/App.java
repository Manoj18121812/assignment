package com.ait.TeluskohibFirst;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) 
	{
		
		Alien telusko = new Alien();
		telusko.setAid(11);
		telusko.setAname("navin");
		telusko.setColor("Green");
		
		Configuration con = new Configuration().configure().addAnnotatedClasses(Alien.class);

		SessionFactory sf = con.buildSessionFactory();

		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		session.save(telusko);
		tx.commit();
	}

}
