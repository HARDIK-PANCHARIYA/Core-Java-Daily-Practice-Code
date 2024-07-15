package com.core.day16constructor.Assignment;

public class ConstOverloadingq1 {
	
	int value1;
	int value2;
	
	ConstOverloadingq1(){
		value1=10;
		value2=20;
		System.out.println("1st constructor");
	}
	
	ConstOverloadingq1(int a){
		value1=a;
		System.out.println("2nd Constructor");
	}
	
	ConstOverloadingq1(int a, int b){
		value1=a;
		value2=b;
		System.out.println("3rd Constructor");
	}
	
	void display() {
		System.out.println("Value1 == "+value1);
		System.out.println("Value2 == "+value2);
	}
	

}
