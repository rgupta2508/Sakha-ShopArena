package com.sakha.shoparena.webapi.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/shoparena")
public class ProfileController {


	//ShopArenaService shopArenaService;
//	UserData userData;
//	ProductData ;
	

	@RequestMapping(value = "/test", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<String> getTestData(@RequestBody String testString, HttpServletRequest req,HttpServletResponse res)
	{
		String result="hello word"+testString;
        List<String> abc=new ArrayList<String>();
        abc.add("jh");
		return abc;
	}
//	@RequestMapping(value = "/allProduct", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
//	public @ResponseBody List<String> getAllProduct()   /*(@RequestBody String testString, HttpServletRequest req,HttpServletResponse res)*/
//	{
//		
//		List listOfProducts = prodList.getAllProduct();
//		return listOfProducts;
//	}
//	
////	@RequestMapping(value = "/addProduct", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
////	public @ResponseBody String addProduct(@RequestBody ProductData prodData, HttpServletRequest req,HttpServletResponse res)
////	{
////		boolean bool=true;//prodList.setProduct(ProductData prodData);
////		if(bool)
////			return "Product is Added Successfully";
////		else
////			return "ProductIn Not Added! Operation Failed";
////	}
//	
//	@RequestMapping(value = "/deleteProduct", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
//	public @ResponseBody String delProduct(@RequestBody int id, HttpServletRequest req,HttpServletResponse res)
//	{
//		boolean bool=prodList.deleteProduct(id);
//		if(bool)
//			return "Product is Added Successfully";
//		else
//			return "ProductIn Not Added! Operation Failed";
//	}
//	
//	
////	@RequestMapping(value = "/adduser", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
////	public @ResponseBody String addUser(@RequestBody UserDetails userData, HttpServletRequest req,HttpServletResponse res)
////	{
////		boolean bool=userData.setRegistration(Userdetails userData);
////		if(bool)
////			return "Registrayion Success";
////		else
////			return "Registration Failed";
////	}

	
	
}
