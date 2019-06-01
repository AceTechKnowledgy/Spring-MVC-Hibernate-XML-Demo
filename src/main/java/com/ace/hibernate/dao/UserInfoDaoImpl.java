package com.ace.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.ace.hibernate.entity.UserForm;
import com.ace.hibernate.util.HibernateUtil;

@Repository
public class UserInfoDaoImpl implements UserInfoDao {
	
	//Getting SessionFactory object
	private SessionFactory sessionFactory;
	
	//Create Session object
	private Session session;
	
	@Override
	public UserForm getUserById(int id) {
		sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
		session.beginTransaction();
		UserForm userForm = (UserForm) session.get(UserForm.class, id);
		return userForm;
	}

}
