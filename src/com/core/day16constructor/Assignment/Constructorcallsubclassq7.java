package com.core.day16constructor.Assignment;

public class Constructorcallsubclassq7 extends Constructorcallparentq7{
	
	Constructorcallsubclassq7() {
		System.out.println("child class Constructor");
	}
	
	Constructorcallsubclassq7(int a){
		System.out.println("Constructor class with arg");
	}
	
	void display(){
		System.out.println("hello");
	}
	
	
	public static void main(String[] args) {
		Constructorcallsubclassq7 obj1=new Constructorcallsubclassq7();
		obj1.display();
		
		System.out.println("-----------------------------------------------------");
		
		Constructorcallsubclassq7 obj2=new Constructorcallsubclassq7(10);
		obj2.display();
	}
	

}
