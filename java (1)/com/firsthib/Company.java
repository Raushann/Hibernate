package com.firsthib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Company {
	public static void main(String[] args) {
		TestEngineer test=new TestEngineer(1, "Raushan", 20000, 25);
		
		DevEngineer dev=new DevEngineer(01, "Abhishek", 3000, 24);
		
		
		Configuration con=new Configuration().configure().addAnnotatedClass(TestEngineer.class).addAnnotatedClass(DevEngineer.class);	
		SessionFactory sf=con.buildSessionFactory();
		Session sess=sf.openSession();
		
		Transaction tr=sess.beginTransaction();
	
		sess.save(test);
		sess.save(dev);
		tr.commit();
	}

}
