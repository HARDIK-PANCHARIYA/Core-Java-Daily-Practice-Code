package com.core.day21.abstraction.assignment;

public class AbstractTestEx3 {
	
	public static void main(String[] args) {
		AbstractSubclassEx3 obj=new AbstractSubclassEx3();
		
		obj.getName("Hardik");
		obj.getGender("Male");
		obj.getCity("Pune");
		obj.getCountry("India");
		obj.display();
	}

}
