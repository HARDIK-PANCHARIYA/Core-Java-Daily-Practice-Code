package com.core.day16constructor;

public class Student {
	
	int id;
	String name;
	int rollno;
	String course;
	
	Student(){
		
		System.out.println("Student login..........");
		
	}
	
	Student(int id, String name, int rollno, String course){
		
		this.id=id;
		this.name=name;
		this.rollno=rollno;
		this.course=course;
		
	}
	
	Student(int id){
		this.id=id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollno=" + rollno + ", course=" + course + "]";
	}
	
	
	

}
