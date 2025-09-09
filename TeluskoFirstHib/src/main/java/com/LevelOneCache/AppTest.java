package com.LevelOneCache;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.spi.SessionFactoryServiceRegistryBuilder;




public class AppTest {

	public static void main(String args[]) {
		
    
		Alien a = null;
		
	    Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
	    ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
	            .applySettings(con.getProperties()).build();
	    SessionFactory sf = con.buildSessionFactory(serviceRegistry);
    
	    Session session1 = sf.openSession();
	     session1.beginTransaction();
	     
	     
	     a= (Alien) session1.get(Alien.class,15);
	     System.out.println(a);
	     session1.getTransaction().commit();
	     session1.close();
	     
	     // comment and get 1st level cache comment session 2 
	     
	     Session session2 = sf.openSession();
	     session2.beginTransaction();
	     
	     //call this only as session 1
	     a= (Alien) session2.get(Alien.class,15);
	     System.out.println(a);
	     session2.getTransaction().commit();
	     session2.close();
	     
	     
	     
    
   
    

    
	
	}
}
