package com.core.day15String;

public class Stringtest {
	
	public static void main(String[] args) {
		
		String s1="hello";  //scp (hello)
		String s2="hi";		//scp (hello,hi)
		String s3 =new String("hello"); 
		//scp (hello,hi)  Heap(hello)
		
		String s4= new  String("byy");
		//scp (hello,hi,byy)  Heap(hello,byy)
		
		// No of object in Heap = ?
		// No of object in scp = ?
		// (2 Heap, 3 scp)
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		System.out.println(s1+s2+s3+s4);
		
		System.out.println(s1=s1+s3);
		
		
		
	}

}
