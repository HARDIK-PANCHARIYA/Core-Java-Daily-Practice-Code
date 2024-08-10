package com.core.day21.abstraction.assignment;

public class AbstractSubclassEx2 extends AbstractclassEx2 {
	
	int x,y,z;
	
	 void get(int a, int b) {
		 x=a;
		 y=b;
	 }
	 
	 void add() {
		 z=x+y;
	 }
	 
	 void display() {
		 System.out.println("The Addition is = "+z);
	 }

}
