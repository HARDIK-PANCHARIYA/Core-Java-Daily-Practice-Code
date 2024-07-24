package com.core.day19.polymorphism.assignment;

public class Overloadingq2test {
	
	public static void main(String args[]) {
		Overloadingq2 obj1= new Overloadingq2();
		obj1.demo(10);
		obj1.demo(10,20);
		double o=obj1.demo(3.1);
		System.out.println("double a*a = "+o );
		int a= obj1.demo(50,60,70);
		System.out.println("int a , b ,c = "+a);
	}

}
