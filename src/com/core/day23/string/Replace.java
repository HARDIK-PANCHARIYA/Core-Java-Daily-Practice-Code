package com.core.day23.string;

public class Replace {
	
	public static void main(String[] args) {
		
		String s1="Hardik.Panchariya.java.developer";
		
		String s2="Good Morning";
		
		System.out.println(s1.replace(".", " "));
		
		System.out.println(s1.replace(s1, s2));
		
		System.out.println(s1.replace("Hardik", "Avi"));
		
		
	}

}
