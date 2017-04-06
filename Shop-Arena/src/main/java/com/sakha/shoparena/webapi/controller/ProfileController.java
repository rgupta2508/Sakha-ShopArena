package com.sakha.shoparena.webapi.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sakha.shoparena.webapi.dao.impl.ProductDetailImpl;
import com.sakha.shoparena.webapi.entity.Product;
import com.sakha.shoparena.webapi.service.ProductDetailsService;
import com.sakha.shoparena.webapi.service.impl.ProductDetailsServiceImpl;

@RestController
@RequestMapping(value = "/shoparena")
public class ProfileController {

	
	ProductDetailsServiceImpl productDetailsServiceImpl=new ProductDetailsServiceImpl();

	@RequestMapping(value = "/test", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String getTestData(@RequestBody String testString)
	{ 
		String result="hello word"+testString;

		return result;
	}


	@RequestMapping(value = "/getproductlist", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Product> getProductList(@RequestBody String testString)
	{ 
		List<Product> productList=productDetailsServiceImpl.getProductListService();

		for (Product product:productList){
			System.out.println(product.getName());
		}
		return productList;
	}
	
}
