package main.java.com.sakha.shoparena.webapi.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestContextHolder;

import com.sakha.form.LoginForm;
import com.sakha.service.*;

import main.java.com.sakha.shoparena.webapi.LoginCode.LoginDAO;
import main.java.com.sakha.shoparena.webapi.service.LoginService;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import org.springframework.beans.factory.annotation.Autowired;

import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("LoginForm.js")
public class LoginController {
	
	@Autowired(required=true)
	private HttpServletRequest request;
	
	@Autowired
	public LoginService loginService;

	@RequestMapping(method = RequestMethod.GET)
	public String showForm(Map model) {
		LoginForm loginForm = new LoginForm();
		model.put("loginForm", loginForm);
		return "loginform";
	}

	
	
	
	
	@RequestMapping(method = RequestMethod.POST)
	public String processForm(@Valid LoginDAO loginForm, BindingResult result,
			Map model) {

		
		if (result.hasErrors()) {
			return "loginform";
		}
		
		/*
		String userName = "UserName";
		String password = "password";
		loginForm = (LoginForm) model.get("loginForm");
		if (!loginForm.getUserName().equals(userName)
				|| !loginForm.getPassword().equals(password)) {
			return "loginform";
		}
		*/
		boolean userExists = loginService.checkLogin(loginForm.getUserName(),loginForm.getPassword());
		if(userExists){
			model.put("loginForm", loginForm);
			return "loginsuccess";
		}else{
			result.rejectValue("userName","invaliduser");
			return "loginform";
		}

	}

}
