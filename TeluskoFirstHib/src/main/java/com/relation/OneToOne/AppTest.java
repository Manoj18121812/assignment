package com.relation.OneToOne;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.spi.SessionFactoryServiceRegistryBuilder;




public class AppTest {

	public static void main(String args[]) {
		Laptop laptop = new Laptop(); 
		
	    
	   laptop.setLid(14);
	   laptop.setLname("dell");
	   
	   Student s = new Student();
	   s.setName("Manoj");
	   s.setRollno(1);
	   s.setMarks(10);
	   s.setLaptop(laptop);
	
    
	    Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
	    ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
	            .applySettings(con.getProperties()).build();
	    
	    SessionFactory sf = con.buildSessionFactory(serviceRegistry);
        Session session = sf.openSession();
        session.beginTransaction();
    
        session.persist(laptop);
        session.persist(s);
        
        session.getTransaction().commit();
 
        System.out.println("done");
    

    
	
	}
}
