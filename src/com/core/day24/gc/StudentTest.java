package com.core.day24.gc;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student s1= new Student(11,"Hardik");
		Student s2= new Student(21,"Sanket");
		Student s3 = new Student(32,"Vedant");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		s2=null;
		System.gc();
		
		System.out.println(s1);
		System.out.println(s3);
		
		
	}

}
