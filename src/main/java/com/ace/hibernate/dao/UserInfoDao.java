package com.ace.hibernate.dao;

import java.util.List;

import com.ace.hibernate.entity.UserForm;

public interface UserInfoDao {

	UserForm getUserById(int id);
	
	List<UserForm> getAllUserForms();
	
	void insertUser(UserForm userForm);

}