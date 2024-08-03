package com.core.day20inheritance.assignment;

public class Mainq6 {
	
	public static void main(String[] args) {
		Employeeq6 e1=new Employeeq6();
		e1.name="Hardik";
		e1.age=25;
		e1.ph=907818;
		e1.specialization="Java Developer";
		
		Managerq6 m1=new Managerq6();
		m1.age=22;
		m1.name="Panchariya";
		m1.ph=686578;
		m1.department="CSE";
		
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.specialization);
		System.out.println(e1.ph);
		System.out.println("--------------------------------------------");
		System.out.println(m1.name);
		System.out.println(m1.age);
		System.out.println(m1.department);
		System.out.println(m1.ph);
		
	}

}
