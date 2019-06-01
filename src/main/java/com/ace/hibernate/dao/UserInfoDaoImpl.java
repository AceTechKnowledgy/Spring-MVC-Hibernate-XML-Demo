package com.ace.hibernate.dao;

import java.util.List;

import org.hibernate.Query;
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
	
	//This method will retrieve a particular record from the table
	@Override
	public UserForm getUserById(int id) {
		sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
		
		session.beginTransaction();
		UserForm userForm = (UserForm) session.get(UserForm.class, id);
		return userForm;
	}

	//This method will get all the users from the table
	@Override
	public List<UserForm> getAllUserForms() {
		sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
		
		session.beginTransaction();
		Query query = session.createQuery("from UserForm");
		@SuppressWarnings("unchecked")
		List<UserForm> userForms = query.list();
		
		session.close();
		sessionFactory.close();
		
		return userForms;
	}

	//This method will insert a record into the table
	@Override
	public void insertUser(UserForm userForm) {
		sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
		
		session.beginTransaction();
		session.save(userForm);
		session.getTransaction().commit();
		
		session.close();
		sessionFactory.close();
	}

}
