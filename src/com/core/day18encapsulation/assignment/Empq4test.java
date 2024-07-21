package com.core.day18encapsulation.assignment;

public class Empq4test {
	
	public static void main(String[] args) {
	Empq4 e1=new Empq4();
	
	e1.setId(101);
	e1.setEmpname("Hardik");
	e1.setEmpage(25);
	
	
	System.out.println("Emp id = "+e1.getId());
	System.out.println("Emp name = "+e1.getEmpname());
	System.out.println("Emp age = "+e1.getEmpage());
	
	}
}
