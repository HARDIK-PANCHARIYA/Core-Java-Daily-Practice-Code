package com.core.day16constructor;

public class Teststudent {
	public static void main(String[] args) {
		
		Student s1=new Student();
		Student s2=new Student(101,"Hardik",53,"BE");
		Student s3=new Student(102);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
