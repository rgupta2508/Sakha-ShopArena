package com.sakha.shoparena.webapi.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sakha.shoparena.webapi.dao.ProductDetailDao;
import com.sakha.shoparena.webapi.entity.Product;
import com.sakha.shoparena.webapi.util.HibernateUtil;

public class ProductDetailImpl implements ProductDetailDao {

	Session session = HibernateUtil.getSessionFactory().openSession();
	Transaction tx = null;

	@Override
	public List<Product> getProductList() {
		List<Product> productList = null;
		try {

			 String queryString = "FROM Product";
			    Query query = session.createQuery(queryString);
			    productList = (List<Product>) query.list();
		   // productList = (List<Product>) hql.list();
			//do your code
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.clear();
		}

		return productList;
	}
	
	
	public static void main(String[] args) {
		ProductDetailImpl productDetailImpl=new ProductDetailImpl();
		List<Product> productList=productDetailImpl.getProductList();
		for (Product product:productList){
			System.out.println(product.getName());
		}
	}

}
