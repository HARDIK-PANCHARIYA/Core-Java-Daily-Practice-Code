package com.core.day6;

public class TestA {
	
	public static void main(String[] args) {
		
	
	A a1=new A();
	
	a1.add(2,4); //use void method does not return any thing 
	
	int sub=a1.sub(7, 4);
	System.out.println("Substraction of x and y = "+sub);
	
	int mul=a1.mul(2,5);
	System.out.println("Multplication of x and y = "+mul);
	
	int div=a1.div(10, 5);
	System.out.println("Division of x and y = "+div);
	
	int mod=a1.mod(3, 6);
	System.out.println("Mod of x and y = "+mod);
	
	}
}
