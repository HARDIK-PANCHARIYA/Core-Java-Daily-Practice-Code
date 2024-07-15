package com.core.day16constructor.Assignment;

public class Constructorq3StudentdataTest {
	
	public static void main(String[] args) {
		
		Constructorq3Studentdata obj1=new Constructorq3Studentdata();

		System.out.println("Student name = "+obj1.getStuName());
		System.out.println("Student Age = "+obj1.getStuAge());
		System.out.println("Student id = "+obj1.getStuID());
		
		System.out.println("--------------------------------------------");
		
		obj1.setStuID(200);
		System.out.println("Student id update = "+obj1.getStuID());
		System.out.println(obj1);
		
		System.out.println("-------------------------------------------------");
		
		Constructorq3Studentdata obj2=new Constructorq3Studentdata(102,"Avi",22);
		System.out.println(obj2);
		System.out.println("Student name = "+obj2.getStuName());
		System.out.println("Student age = "+obj2.getStuAge());
		System.out.println("Student id = "+obj2.getStuID());
		
		System.out.println("----------------------------------------------");
		
		obj2.setStuName("Avi Panchariya");
		System.out.println("Updated name = "+obj2.getStuName());
		System.out.println(obj2);

		
	}

}
