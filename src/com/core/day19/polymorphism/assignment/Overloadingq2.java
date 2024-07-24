package com.core.day19.polymorphism.assignment;

public class Overloadingq2 {
	
	void demo(int a) {
		System.out.println("int a = "+a);
	}
	
	void demo(int a, int b) {
		System.out.println("int a and int b = "+a+" , "+b);
	}
	
	double demo(double a) {
		System.out.println("double input  a = "+a);
		return a+a;
	}
	
	int demo(int a, int b, int c) {
		return a+b+c;
	}

}
