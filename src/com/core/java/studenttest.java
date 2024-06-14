package com.core.java;

public class studenttest {

	public static void main(String[] args) {

		student s1 = new student();
		student s2 = new student();
		student s3 = new student();
		
//************************************************************************************************************************
//		Value assign to Reference variable
		s1.id = 101;
		s1.rollno = 1;
		s1.name = "Hardik";
		s1.course = "BE-CSE";
//		Print value
		System.out.println(s1.id + "\n" + s1.rollno + "\n" + s1.name + "\n" + s1.course + "\n");
		
//**************************************************************************************************************************************		
		
//		Value assigned to reference value and print in print function it self
		System.out.println((s2.id=102)+"\n"+(s2.rollno = 2)+"\n"+(s2.name="Avi")+"\n"+(s2.course="B-COM"));

	}

}

