package com.sakha.shoparena.webapi;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sakha.shoparena.webapi.entity.Product;
import com.sakha.shoparena.webapi.entity.User;
import com.sakha.shoparena.webapi.util.HibernateUtil;

@SpringBootApplication
public class AppStart {

	public static void main(String[] args) {
		
		SpringApplication.run(AppStart.class,args);
		
		
//		   System.out.println("Hibernate many to many (Annotation)");
//			Session session = HibernateUtil.getSessionFactory().openSession();
//
//			session.beginTransaction();
//
//			User stock = new User();
//			
//		        stock.setFirstName("7a521j11");
//		        stock.setUserName("PADINIka11");
//
//		        Product category1 = new Product("CONSUMER", "CONSUMER COMPANY");
//		        Product category2 = new Product("INVESTMENT", "INVESTMENT COMPANY");
//
//		        Set<Product> categories = new HashSet<Product>();
//		        categories.add(category1);
//		        categories.add(category2);
//
//		        stock.setProducts(categories);
//
//		        session.save(stock);
//
//			session.getTransaction().commit();
//			System.out.println("Done");
		
/*
	        System.out.println("Hibernate many to many (Annotation)");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();

			User user = new User();
	        //stock.setStockCode("7052");
	        //stock.setStockName("PADINI");

	        Product product = new Product();
	        Product product2 = new Product();
	        product.setBrandName("hp");
	        product2.setBrandName("dell");

	        Set<Product> productSet = new HashSet<Product>();
	        productSet.add(product);
	        productSet.add(product2);

	        user.setProduct(productSet);

	        session.save(user);

		session.getTransaction().commit();
		System.out.println("Done");*/
		}
		

}
