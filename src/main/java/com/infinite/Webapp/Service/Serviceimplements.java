package com.infinite.Webapp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infinite.Webapp.Entity.Employee;
import com.infinite.Webapp.Repository.DaoImplements;
@Service
public class Serviceimplements implements IServiceInterface{
	@Autowired
	DaoImplements di;
	@Transactional
	public List<Employee> getAllData() {
		// TODO Auto-generated method stub
		return di.getAllData();
		
	}
	
	@Transactional
	public void addData(Employee emp) {
		// TODO Auto-generated method stub
		//return null;
		di.addData(emp);
	}
	

}
