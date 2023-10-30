package com.infinite.Webapp.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
@Table(name="Employee")
public class Employee {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="firstname")
	@NotEmpty(message="this field is mandatory..!")
	private String firstname;
	
	@Column(name="lastname")
	@NotEmpty(message="this field is mandatory..!")
	private String lastname;
	
	@Column(name="department")
	@NotEmpty(message="this field is mandatory..!")
	private String department;
	
	public Employee(){
		
	}
	//parameterized constructor
	public Employee(String firstname, String lastname, String department)
	{
		this.firstname=firstname;
		this.lastname=lastname;
		this.department=department;
	}
	
	//generating the getters and setters for the bean class
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
