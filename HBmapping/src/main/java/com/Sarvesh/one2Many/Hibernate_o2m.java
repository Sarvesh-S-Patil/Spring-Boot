package com.Sarvesh.one2Many;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernate_o2m {
	
	public static void main(String[] args) {
		Configuration con = new Configuration();
		SessionFactory sf = con.configure("one2Many.hbm.cfg.xml").buildSessionFactory();
		System.out.println("Connection Succesful");
	}
}
