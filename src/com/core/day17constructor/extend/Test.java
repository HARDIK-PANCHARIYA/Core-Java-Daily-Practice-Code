package com.core.day17constructor.extend;

public class Test {
	
	public static void main(String [] args) {
		
		Student s1=new Student();
		Student s2=new Student(123,"BE");
		Student s3=new Student(101,"Hardik","21/03/1999",123,"BE");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
	}

}
