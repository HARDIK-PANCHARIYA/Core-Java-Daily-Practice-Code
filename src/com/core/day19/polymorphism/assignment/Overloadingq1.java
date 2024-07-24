package com.core.day19.polymorphism.assignment;

public class Overloadingq1 {
	
	void sum(int a, int b) {
		System.out.println("Sum = "+(a+b));
	}
	
	void sum(double a, double b) {
		System.out.println("Sum = "+(a+b));
	}
	
	public static void main(String[] args) {
		
		Overloadingq1 obj=new Overloadingq1();
		obj.sum(10,20);
		obj.sum(3.1, 3.4);
		
	}

}
