package com.core.day26.contenment;

public class Employee {
	
	int id;
	String name;
	
	EmpDetails empdetails;
	empSalaryDetails empsalary;
	
	
	public Employee(int id, String name, EmpDetails empdetails, empSalaryDetails empsalary) {
		super();
		this.id = id;
		this.name = name;
		this.empdetails = empdetails;
		this.empsalary = empsalary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "\nempdetails=" + empdetails + "\nempsalary=" + empsalary
				+ "]";
	}
	
	
}
