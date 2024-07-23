package com.core.day19.polymorphismoverriding;

public class B extends A {
	
	void m1() {
		System.out.println("Child class");
	}
	
	void m2() {
		super.m1();
	}

}
