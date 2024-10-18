package com.core.day23.string;

public class Split {
	
	public static void main(String[] args) {
	
	String s1= "Hardik.Panchariya.java.developer";
	String [] str=(s1.split("\\."));
	for(String s:str) {
		System.out.println(s);
	}
	
	}
}
