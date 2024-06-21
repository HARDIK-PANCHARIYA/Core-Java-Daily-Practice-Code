package com.core.day7;

public class B {
	
	static int x=111;
	
	int a = 50;
	
	void method1(int p,int q) {
		x=x+1;
		a=a+1;
		p=p+1;
		q=q+1;
		
		System.out.println("Method 1");
		System.out.println("x = "+x);
		System.out.println("a = "+a);
		System.out.println("p = "+p);
		System.out.println("q = "+q);
		System.out.println("--------------------");		
	}
	
	void method2(int y,int z) {
		x=x+1;
		a=a+1;
		y=y+1;
		z=z+1;
		
		System.out.println("Method 2");
		System.out.println("x = "+x);
		System.out.println("a = "+a);
		System.out.println("y = "+y);
		System.out.println("z = "+z);
		System.out.println("----------------");
	}
	
	
	

}
