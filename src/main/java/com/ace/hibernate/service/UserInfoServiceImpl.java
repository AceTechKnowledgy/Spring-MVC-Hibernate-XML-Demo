package com.ace.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ace.hibernate.dao.UserInfoDao;
import com.ace.hibernate.entity.UserForm;

@Service
public class UserInfoServiceImpl implements UserInfoService {
	
	@Autowired
	private UserInfoDao userInfoDao;
	
	//Service method to call the DAO methods to get the record based on id
	@Override
	public UserForm getUserInfoById(int id) {
		return userInfoDao.getUserById(id);
	}

	//Service method to call the DAO methods to get all the records
	@Override
	public List<UserForm> getUserForms() {
		return userInfoDao.getAllUserForms();
	}

	//Service method to call the DAO methods to insert a record
	@Override
	public void addUser(UserForm userForm) {
		userInfoDao.insertUser(userForm);
	}

}
