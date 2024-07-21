package com.core.day18encapsulation.assignment;

public class Studentq5test {
	
	
	public static void main(String[] args) {
		
	Studentq5 s1=new Studentq5();
	
//	s1.rollno=-4;  // if variable public access 
	
	s1.setName("Jupiter");
	s1.setRollno(3);
	s1.setAge(21);
	
	System.out.println("Name - "+s1.getName());
	System.out.println("Roll no - "+s1.getRollno());
	System.out.println("Age - "+s1.getAge());
	
	}

}
