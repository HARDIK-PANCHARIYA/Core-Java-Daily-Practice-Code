package com.core.day18encapsulation;

public class PersonTest {
	
	public static void main(String args[]) {
		
		Person p1=new Person(101,"Hardik",25);
		
		p1.setAge(10);  // change the gatter value
		System.out.println("Updated age = "+p1.getAge());  // only age is get display
		
		System.out.println(p1);
		
	}

}
