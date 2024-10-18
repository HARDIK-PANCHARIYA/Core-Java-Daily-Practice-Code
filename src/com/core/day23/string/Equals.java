package com.core.day23.string;

public class Equals {
	
	public static void main(String[] args) {
		
	String s3=new String("Hello");
	String s4=new String("Hello");
	
	if(s3==s4) {  // string at two new address ---> == check address
		System.out.println("Equal");
	}else {
		System.out.println("NOT Equals");
	}
	
	
	//To check actual content
	if(s3.equals(s4)) {
		System.out.println("Equal");
	}else {
		System.out.println("Not Equals");
	}

}
}
