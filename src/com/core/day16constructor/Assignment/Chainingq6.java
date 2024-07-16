package com.core.day16constructor.Assignment;

public class Chainingq6 {
	
	Chainingq6(){
		System.out.println("Default Constructor");
	}
	
	Chainingq6(int a){
		this();
		System.out.println("Single paramatrized constructor");
	}
	
	Chainingq6(String a, int b){
		this(10);
		System.out.println("Double paramatrized constructor");
	}
	
	Chainingq6(int a, int b, int c){
		this("Hardik",20);
		System.out.println("Triple paramatrized constructor");
	}

}
