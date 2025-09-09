package com.fetchrecorddb;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.spi.SessionFactoryServiceRegistryBuilder;

import com.insertrecord.Alien;




public class App1 {

	public static void main(String args[]) {
		//Alien1 telusko = new Alien1(); Or we use next line
		Alien1 telusko = null;
	    
    
	    Configuration con = new Configuration().configure().addAnnotatedClass(Alien1.class);
	    
	    ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
	            .applySettings(con.getProperties()).build();
	    
	    SessionFactory sf = con.buildSessionFactory(serviceRegistry);
    
    Session session = sf.openSession();
    Transaction t = session.beginTransaction();
    
    telusko = (Alien1) session.get(Alien1.class,13);
    
    t.commit();
   System.out.println(telusko);
    System.out.println("done");
    

    
	
	}
}
