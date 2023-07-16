package com.Sarvesh.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateSessionExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration c = new Configuration();
		
		SessionFactory sFactory = c.configure("hbm-annotation.cfg.xml").buildSessionFactory();
		
		Session s= sFactory.openSession();
		System.out.println("Session has been Opened.");
		Transaction tx = s.beginTransaction();
		CustomerAnnotation cus = new CustomerAnnotation(2,"Suresh","20,Delhi");
		CustomerAnnotation customer = s.get(CustomerAnnotation.class, 2);
		System.out.print(customer);
//		s.save(cus);
//		s.merge(cus);
		s.flush();
		tx.commit();
		s.close();
		
		
		
	}
}
                                          