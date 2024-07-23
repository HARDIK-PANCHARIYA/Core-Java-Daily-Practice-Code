package com.core.day19.polymorphismoverloading;

public class Atest {
	
	public static void main(String[] args) {
		
	
	A obj1=new A();
	
	System.out.println(obj1.add(10,20));
	System.out.println(obj1.add(10,20,30));
	System.out.println(obj1.add(10.1f,20.2f));
	System.out.println(obj1.add(20, 10.1f));
	System.out.println(obj1.add(20.4f, 10));
}
}
