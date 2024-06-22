package com.core.day8;

public class Producttest {
	
	public static void main(String[] args) {
		
		Product p1=new Product();
		Product p2=new Product();
		Product p3=new Product();
		
		p1.id=101; p1.name="Story Book"; p1.price=1000.1f;
		p2.id=102; p2.name="Comady Book"; p2.price=2000.5f;
		p3.id=103; p3.name="Vedant Book"; p3.price=3000.6f;
		
		float sum=p1.price+p2.price+p3.price;

		
		System.out.println("Sum of all product = "+sum);

		
		
	
	}

}
