package com.ace.hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ace.hibernate.entity.UserForm;
import com.ace.hibernate.service.UserInfoService;

@Controller
public class MainController {
	
	@Autowired
	private UserInfoService userInfoServiceImpl;

	//This method will be called when the user pressed the link in index.jsp page and display the main.jsp page
	@RequestMapping("mainpage")
	public String displayMainpage() {
		return "main";
	}
}
