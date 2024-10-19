package com.core.day23.string;

public class StringBuilderDemo {
	
	public static void main(String[] args) {
		
	StringBuilder s1 =new StringBuilder();
	
	String s11="Hardik";
	
	
	System.out.println(s1.append(s11));
	
	System.out.println(s1.charAt(0));
	
	System.out.println(s1.insert(1, "@"));
	
	System.out.println(s1.reverse());
	
	System.out.println(s1.lastIndexOf("i"));


	
	}

}
