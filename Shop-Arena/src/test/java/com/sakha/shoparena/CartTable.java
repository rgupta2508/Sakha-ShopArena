package com.sakha.shoparena;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CartTable {
	public static void main(String[] k)
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		UserDetails ud= new UserDetails();
		ud.setFirstName("Ranjan");
		ud.setEmail("ranjan@gmail.com");
		ud.setPhone(789456123);
		Product pd= new Product();
		pd.setBrandName("Lenovo");
		pd.setCategory("Mobile");
		pd.setBrandVersion("L500");
		pd.setPrice(8500);
		pd.setProductDesc("Slim Design smart Phone");
		session.save(ud);
		session.save(pd);
		tx.commit();
		session.close();
		System.out.println("Shown to cart...");
		factory.close();
	}

}
