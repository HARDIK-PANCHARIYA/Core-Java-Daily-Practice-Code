package com.core.day17constructor.extend;

public class Student extends Person {
	
	int rollno;
	String course;
	
	Student(){
		super();
	}
	
	Student(int rollno, String course){
		super();
		this.rollno=rollno;
		this.course=course;
	}
	
	Student(int id, String name, String dob, int rollno, String course){
		super(id,name,dob);
		this.rollno=rollno;
		this.course=course;
		
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", course=" + course + "]"+super.toString();
	}
	
	
	
	
}
