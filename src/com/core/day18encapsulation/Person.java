package com.core.day18encapsulation;

public class Person {
	
	private int id;
	private String name;
	private int age;
	
	
	Person(int id, String name, int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	// getter and setter
	public int getId(){
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		if(age>0)
		this.age=age;
	}
	
	@Override
	public String toString() {
		return id+" "+name+" "+age;
	}

}
