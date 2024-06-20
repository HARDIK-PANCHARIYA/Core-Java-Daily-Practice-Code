package com.core.day6;

public class TestMethodobject {
	
	public static void main(String args[]) {
		
		//Object Creation
		Methodobject obj=new Methodobject();
		
		//obj calls a method 
		
		//void method 
		obj.Calculateareaofsquare(4);
		
		double rc=obj.Calculateareaofrectangle(2,3);
		System.out.println("Area of Rectangle = "+rc);
		
		double tr=obj.Calculateareaoftriangle(3,6);
		System.out.println("Area of Triangle = "+tr);
		
		double cr=obj.Calculateareaofcircle(3);
		System.out.println("Area of Circle = "+cr);
		
		double sp=obj.Claculateareaofsphere(3);
		System.out.println("Area of sphere = "+sp);
				
	}

}
