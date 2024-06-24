package com.core.day9;

public class Loginaloperator {
	
	int a = 10;
	int b = 20;
	int c = 30;
	int d = 10;
	
	void logicaloperator() {
		
		System.out.println("a = "+a+"  b = "+b+"  c = "+c+"  d = "+d);
		
		 System.out.println("a Grater than b AND b is Grater than c = "+(a>b && b>c));
		 
		 System.out.println("a is Grater than c OR a is Equal to d = "+(a>c || a==d));
		 
		 boolean a=true;
		 
		 System.out.println("a = true----change to false---> "+(!a)); //change true to false --- false to true
		
	}

}
