package com.techouts.hibernatePrograms;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class FetchData {

    public static void main(String[] args) {
		
    	Configuration config=new Configuration();
    	config.configure("hibernate.cfg.xml");
    	SessionFactory factory=config.buildSessionFactory();
    	Session session=factory.openSession();
    	
    	System.out.println("fetching");
         
    	Student stuObj1=session.get(Student.class, 1);
    	
    	System.out.println(stuObj1.getName());
    	System.out.println(stuObj1.getEmail());
    	System.out.println(stuObj1.getAddress());
    	
    	
    	System.out.println(".........................Success............................");
    	
        Student stuObj2=session.load(Student.class, 2);
    	
    	System.out.println(stuObj2.getName());
    	System.out.println(stuObj2.getEmail());
    	System.out.println(stuObj2.getAddress());
    	
    	
    	System.out.println("Success");
    	
    	
	}
	

}
