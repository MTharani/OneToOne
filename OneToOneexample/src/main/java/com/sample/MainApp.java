package com.sample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MainApp {

	public static void main(String[] args)
	{
		Adress adr=new Adress();
		adr.setStreet("dpk strett");
		adr.setPincode(601602);
		adr.setDis("kottucherry");
		
        Student sob=new Student();
        sob.setSname("devaki");
        sob.setCourse("testing");
        sob.setAd(adr);
		
		Configuration conn=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Adress.class);
		ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(conn.getProperties()).buildServiceRegistry();
		SessionFactory sf=conn.buildSessionFactory(reg);
		Session sess=sf.openSession();
		Transaction tx=sess.beginTransaction();
		//sess.save(adr);
		sess.save(sob);
		tx.commit();
		sess.close();

	}

}
