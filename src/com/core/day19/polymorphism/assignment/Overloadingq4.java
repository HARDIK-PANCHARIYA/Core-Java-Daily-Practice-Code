package com.core.day19.polymorphism.assignment;

public class Overloadingq4 {
	
	private String name;
	private int age;
	private String email;
	
	public void getData(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public void getData(String name, int age, String email) {
		this.name=name;
		this.age=age;
		this.email=email;
	}
	
	public void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(email);
	}

}
