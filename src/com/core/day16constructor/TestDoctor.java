package com.core.day16constructor;

public class TestDoctor {
	
	public static void main(String args[]) {
		
		Doctor d1=new Doctor();
		Doctor d2=new Doctor(101,"Hardik",2.4f,"cardio");
		Doctor d3=new Doctor(102,"Ram","ortho");
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
	}

}
