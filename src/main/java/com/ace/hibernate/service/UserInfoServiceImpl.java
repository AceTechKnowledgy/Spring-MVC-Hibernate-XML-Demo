package com.ace.hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ace.hibernate.dao.UserInfoDao;
import com.ace.hibernate.entity.UserForm;

@Service
public class UserInfoServiceImpl implements UserInfoService {
	
	@Autowired
	private UserInfoDao userInfoDao;
	
	@Override
	public UserForm getUserInfoById(int id) {
		return userInfoDao.getUserById(id);
	}

}
