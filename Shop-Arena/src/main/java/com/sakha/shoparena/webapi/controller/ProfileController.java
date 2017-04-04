package com.sakha.shoparena.webapi.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/shoparena")
public class ProfileController {


	

	@RequestMapping(value = "/test", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String getTestData(@RequestBody String testString)
	{
		String result="hello word"+testString;


		return result;
	}

	
	
}
