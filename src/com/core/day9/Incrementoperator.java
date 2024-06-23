package com.core.day9;

public class Incrementoperator {
	
	int a = 10; // for Pre increment 
	int b = 10;   // for Post increment
	
	void Preincrement(){  // Pre Increment 
		
		// the value first get increase
	  
		System.out.println("a = "+a);
		System.out.println("++a = "+ ++a);
		System.out.println("++a = "+ ++a);
		System.out.println("++a = "+ ++a);
		System.out.println("----------------------------");
	}
	
	void Postincrement() {  // Post Increment
		
		System.out.println("b = "+b);
		System.out.println(b++ + " = b++");
		System.out.println(b++ + " = b++");
		System.out.println(b++ + " = b++");
		
	}

}
