package com.core.day7;

public class Atest {
	
	public static void main(String[] args) {
		
	System.out.println("a = "+A.a+"\n"+"----------");
	/*
	 	Without creating object 
		we can access static variable  
	*/
	
	
	A a1=new A();
	A a2=new A();
	
	a1.methodA(10,20);
	a1.methodA(7, 6);
	
	a2.methodA(10,20);
	a2.methodA(2,3);
	}
}
