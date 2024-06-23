package com.core.day9;

public class Decrementoperator {

	int a = 10;
	int b = 10;
	
	void Predecrement() {
		
		System.out.println("a = "+a);
		System.out.println("--a = "+ --a);
		System.out.println("--a = "+ --a);
		System.out.println("--a = "+ --a);
		System.out.println("-------------------------");
	}
		
	void Postdecrement() {
		
		System.out.println(a+" = a");
		System.out.println(a-- +" = a--");
		System.out.println(a-- +" = a--");
		System.out.println(a-- +" = a--");
	}
		
	
	
}
