package com.core.day7;

public class A {
	
	static int a = 10; //STATIC VARIABLE  
	
	
	int b = 10; //INSTANCE VARIABLE
	
	void methodA(int x, int y) { // X AND Y IS LOCAL VARIABLE
		
		a=a+1;
		b=b+1;
		x=x+1;
		y=y+1;
		
		System.out.println("a = "+a);	
		System.out.println("b = "+b);
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		System.out.println("---------------------");
		
	}
	
	

}
