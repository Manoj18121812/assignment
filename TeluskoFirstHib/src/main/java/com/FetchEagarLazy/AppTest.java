package com.FetchEagarLazy;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.spi.SessionFactoryServiceRegistryBuilder;




public class AppTest {

	public static void main(String args[]) {
		
    
	    Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
	    
	    ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
	            .applySettings(con.getProperties()).build();
	    
	    SessionFactory sf = con.buildSessionFactory(serviceRegistry);
    
    Session session = sf.openSession();
    Transaction t = session.beginTransaction();
    
   session.getTransaction().commit();
    
   
    

    
	
	}
}
