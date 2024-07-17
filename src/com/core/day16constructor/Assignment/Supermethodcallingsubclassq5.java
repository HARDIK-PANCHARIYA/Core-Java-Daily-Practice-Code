package com.core.day16constructor.Assignment;

public class Supermethodcallingsubclassq5 extends Supermethodcallingq5 {
	
	void display() {
		System.out.println("Child class method");
	}
	
	void printmsg() {
		
		display();
		
		super.display();  // use for parent class 
	}
	
	public static void main(String[] args) {
		Supermethodcallingsubclassq5 obj= new Supermethodcallingsubclassq5();
		obj.printmsg();
	}

}
