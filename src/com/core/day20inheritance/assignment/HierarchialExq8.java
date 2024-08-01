package com.core.day20inheritance.assignment;

public class HierarchialExq8 {
	public void methodB() {
		System.out.println("B class method update");
	}
	
	public static void main(String[] args) {
		Bq8 obj1=new Bq8();
		Cq8 obj2=new Cq8();
		Dq8 obj3=new Dq8();
		
		obj1.methodA();
		obj1.methodB();
		obj2.methodA();
		obj3.methodA();
	}
}
