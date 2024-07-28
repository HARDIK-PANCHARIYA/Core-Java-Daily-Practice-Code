package com.core.day20inheritance.assignment;

public class Carq2 extends Vehicalq2 {
	
	String modelType;
	
	public void showDetails() {
		vehicalType="Car";
		modelType="Sport";
		
		System.out.println(vehicalType+" "+modelType);
	}
	
	public static void main(String[] args) {
		
		Carq2 obj=new Carq2();
		obj.showDetails();
	}

}
