package com.infinite.Webapp.Repository;

import java.util.List;

import com.infinite.Webapp.Entity.Employee;

public interface IDaoClass {
	public List<Employee> getAllData();
	public void addData(Employee emp);
}
