package com.ace.hibernate.service;

import java.util.List;

import com.ace.hibernate.entity.UserForm;

public interface UserInfoService {

	UserForm getUserInfoById(int id);
	
	List<UserForm> getUserForms();

	void addUser(UserForm userForm);
}