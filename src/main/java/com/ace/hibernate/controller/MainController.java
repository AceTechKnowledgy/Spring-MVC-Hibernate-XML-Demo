package com.ace.hibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ace.hibernate.entity.UserForm;
import com.ace.hibernate.service.UserInfoService;

@Controller
public class MainController {
	
	@Autowired
	private UserInfoService userInfoServiceImpl;

	//This method will be called when the user pressed the link in index.jsp page and display the main.jsp page
	@RequestMapping("mainpage")
	public String displayMainpage(Model model) {
		List<UserForm> userForms = userInfoServiceImpl.getUserForms();
		model.addAttribute("userForms", userForms);
		model.addAttribute("userInfo", new UserForm());
		return "main";
	}
	
	//The below method will be called when the user clicks the "Add" button in main.jsp page. Also returned to the main page
	@RequestMapping("addUser")
	public String addUser(@ModelAttribute UserForm userForm) {
		userInfoServiceImpl.addUser(userForm);
		
		return "redirect:mainpage";
	}
}
