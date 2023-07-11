package com.Sarvesh.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateSession {
	public static void main(String[] args) {

		Configuration c = new Configuration();
		
		SessionFactory sFactory = c.configure("one2one-annotation.hbm.cfg.xml").buildSessionFactory();
		
		Session session= sFactory.openSession();
		System.out.println("Session has been Opened.");
		Transaction tx = session.beginTransaction();
		
		customerAnnotation cx = new customerAnnotation();
		cx.setName("Ram");
		cx.setAddress("404,NY");
		
		CustomerTransaction ctx = new CustomerTransaction();
		ctx.setTotal(500);
		cx.setTransaction(ctx);
		ctx.setCustomer(cx);
		
		session.save(ctx);
		session.flush();
		tx.commit();
		
		
	}

}
