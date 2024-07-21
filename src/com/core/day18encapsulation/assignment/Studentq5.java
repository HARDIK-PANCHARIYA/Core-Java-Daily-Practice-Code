package com.core.day18encapsulation.assignment;

public class Studentq5 {
	
	private String name;
	private int rollno;
	private int age;
	
	
	public String getName() {
		return name ;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	
	public int getRollno(){
		return rollno;
	}
	public void setRollno(int rollno) {
		if(rollno>0) {
			this.rollno=rollno;
		}
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}

}
