package com.core.day6;

public class TestMethodobject {
	
	public static void main(String args[]) {
		
		Methodobject obj=new Methodobject();
		
		double sq=obj.Calculateareaofsquare(4);
		System.out.println("Area of Square = "+sq);
		
		double rc=obj.Calculateareaofrectangle(2,3);
		System.out.println("Area of Rectangle = "+rc);
		
		double tr=obj.Calculateareaoftriangle(3,6);
		System.out.println("Area of Triangle = "+tr);
		
		double cr=obj.Calculateareaofcircle(3);
		System.out.println("Area of Circle = "+cr);
	}

}
