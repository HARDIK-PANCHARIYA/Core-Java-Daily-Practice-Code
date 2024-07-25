package com.core.day19.polymorphism.assignment;

public class Overloadingq3 {
	
	void find (int l, int b) {
		System.out.println("Area = "+l*b);
	}
	
	void find(int l, int b, int h) {
		System.out.println("Area = "+l*b*h);
	}
	
	public static void main(String[] args) {
		Overloadingq3 obj=new Overloadingq3();
		obj.find(10,20);
		obj.find(10, 20, 30);
	}

}
