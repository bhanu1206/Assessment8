package com.infinite.Webapp.Service;

import java.util.List;

import com.infinite.Webapp.Entity.Employee;

public interface IServiceInterface {
	public List<Employee> getAllData();
	public void addData(Employee emp);
}
