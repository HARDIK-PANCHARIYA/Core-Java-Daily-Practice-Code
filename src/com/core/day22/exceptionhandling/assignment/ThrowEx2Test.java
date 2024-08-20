package com.core.day22.exceptionhandling.assignment;

public class ThrowEx2Test {
	
	public static void main(String[] args) {
		try {
			ThrowEx2 obj=new ThrowEx2();
			obj.mymethods(4);
		}catch(Exception e){
			e.printStackTrace();
			System.out.println(e);
		}	
	}

}
