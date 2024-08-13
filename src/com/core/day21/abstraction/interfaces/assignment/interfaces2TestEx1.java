package com.core.day21.abstraction.interfaces.assignment;

public class interfaces2TestEx1 implements interfaces1Ex1,interfaces2Ex1{
	
	public void myMethod() {
		System.out.println("Multiple inheritance example using interface");
	}
	
	public static void main(String[] args) {
		interfaces2TestEx1 obj=new interfaces2TestEx1();
		obj.myMethod();
	}

}
