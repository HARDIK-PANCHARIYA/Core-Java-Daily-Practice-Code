package com.core.day18encapsulation;

public class Student {
	
	private int id;
	private String name;
	private String course;
	private long rollno;
	
	Student(){
		System.out.println("Default constructor");
	}
	
	void Student1(){
		System.out.println("this is method");
	}
	
	Student(int id, String name, String course, long rollno){
		this();
		this.Student1();
		
		System.out.println("Paramatrized Constructor");
		
		this.id=id;
		this.name=name;
		this.course=course;
		this.rollno=rollno;
	}
	
	//getter and setter
	
	public int getId() {
		return id;
	}
	
	void setId(int id){
		this.id=id;
	}
	
	public String getName(){
		return name;
	}
	
	void setName(String name) {
		this.name=name;
	}
	
	public String getCourse(){
		return course;
	}
	
	void setCourse(String course) {
		this.course=course;
	}
	
	public long getRollno() {
		return rollno;
	}
	
	void setRollno(long rollno){
		this.rollno=rollno;
	}
	
	public String toString() {
		return "Student = "+id+" "+name+" "+course+" "+rollno;
	}
}
