package com.core.day16constructor.Assignment;

public class Constructorq3 {
	
	int value1;
	int value2;
	
	Constructorq3(){
		value1=10;
		value2=20;
		System.out.println("Inside Constructor ");
	}
		
		void dispaly() {
			System.out.println("value1 == "+value1);
			System.out.println("value2 == "+value2);
		}
		
		public static void main(String[] args) {
			
			Constructorq3 a1=new Constructorq3();
			a1.dispaly();
			
		}
	

}
