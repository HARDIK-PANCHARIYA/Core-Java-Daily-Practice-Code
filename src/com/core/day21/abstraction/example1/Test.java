package com.core.day21.abstraction.example1;

public class Test {
	
	public static void main(String[] args) {
		
	A a;  // abstract class 
	X objx=new X();
	Y objy=new Y();
	
	objx.m1();
	objx.m2(10, 20);
	objx.m3();
	
	System.out.println("---------------------------------------------");
	
	objy.m1();
	objy.m2(10, 20);
	objy.m3();
	
	}
}
