package com.core.day18encapsulation;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student s1=new Student(101,"Hardik","B.E",100);
		System.out.println(s1);
		System.out.println("============================================");
		System.out.println(s1.getCourse());
		s1.setCourse("Java-Developer");
		System.out.println(s1.getCourse());
		System.out.println("============================================");
		System.out.println(s1);
		
		
	}

}
