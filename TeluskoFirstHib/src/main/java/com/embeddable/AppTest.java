package com.embeddable;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.spi.SessionFactoryServiceRegistryBuilder;




public class AppTest {

	public static void main(String args[]) {
		Alien telusko = new Alien(); 
		
	    AlienName an = new AlienName();
	    an.setFname("manoj");
	    an.setMname("kanifnath");
	    an.setLname("gavhane");
	    
		
	    telusko.setAid(101);
	    telusko.setAname(an);
	    telusko.setColor("skyblue");
    
	    Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
	    
	    ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
	            .applySettings(con.getProperties()).build();
	    
	    SessionFactory sf = con.buildSessionFactory(serviceRegistry);
    
    Session session = sf.openSession();
    Transaction t = session.beginTransaction();
    
    session.persist(telusko);
    t.commit();
   // session.close();
    System.out.println("done");
    System.out.println(telusko);
    

    
	
	}
}
