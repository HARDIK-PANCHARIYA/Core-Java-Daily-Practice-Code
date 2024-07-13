package com.core.day16constructor;

public class A {
	
	int x=100;
	int y;
	
	A(){
		super(); // already mention in each constructor -- present only at first line
		System.out.println("Cons of A ");
	}
	
	void m1(){
		System.out.println("m1");
	}

}
