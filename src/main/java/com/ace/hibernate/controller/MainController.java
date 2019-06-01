package com.ace.hibernate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	//This method will be called when the user pressed the link in index.jsp page and display the main.jsp page
	@RequestMapping("mainpage")
	public String displayMainpage() {
		return "main";
	}
}
