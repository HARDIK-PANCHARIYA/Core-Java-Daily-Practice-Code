package com.core.day19.polymorphism.assignment;

public class Overloadingq4test {
	
	public static void main(String[] args) {
		Overloadingq4 obj=new Overloadingq4();
		obj.getData("Hardik",25);
		obj.display();
		System.out.println("-------------------------------------");
		obj.getData("Hardik",25,"hardikpanchariya3012@gmail.com");
		obj.display();
	}

}
