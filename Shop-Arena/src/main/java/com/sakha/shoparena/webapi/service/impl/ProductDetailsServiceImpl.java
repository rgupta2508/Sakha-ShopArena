package com.sakha.shoparena.webapi.service.impl;

import java.util.List;

import com.sakha.shoparena.webapi.dao.impl.ProductDetailImpl;
import com.sakha.shoparena.webapi.entity.Product;
import com.sakha.shoparena.webapi.service.ProductDetailsService;

public class ProductDetailsServiceImpl implements ProductDetailsService{
	ProductDetailImpl productDetailImpl=new ProductDetailImpl();

	
	@Override
	public List<Product> getProductListService() {
		return productDetailImpl.getProductList();
	}

}
