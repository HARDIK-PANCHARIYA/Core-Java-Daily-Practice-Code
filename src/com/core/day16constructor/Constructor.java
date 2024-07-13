package com.core.day16constructor;

public class Constructor {
	
	int value1;
	int value2;
	
	Constructor() {
		value1=10;
		value2=20;
		System.out.println(" 1st Constructor ");
	}
	
	Constructor(int a){
		value1=a;
		System.out.println(" 2nd Constructor ");	
	}
	
	Constructor(int a, int b){
		value1=a;
		value2=b;
		System.out.println(" 3rd Constructor ");
	}
	
	void dispaly() {
		System.out.println(" value1 ==== "+value1);
		System.out.println( " value2 ==== "+value2);
	}

}
