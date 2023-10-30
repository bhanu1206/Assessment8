package com.infinite.Webapp.Repository;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.infinite.Webapp.Entity.Employee;
@Repository
public class DaoImplements implements IDaoClass{
	@Autowired
	SessionFactory sfactory;
	
	public void setSfactory(SessionFactory sfactory) {
		this.sfactory = sfactory;
	}

	public List<Employee> getAllData() {
		// TODO Auto-generated method stub
		Session session = this.sfactory.getCurrentSession();
		List<Employee> ls = session.createQuery("from Employee").list();
		return ls;
	}


	public void addData(Employee emp) {
		// TODO Auto-generated method stub
		Session session = this.sfactory.getCurrentSession();
		session.save(emp);
	}

	
	

	
	}


