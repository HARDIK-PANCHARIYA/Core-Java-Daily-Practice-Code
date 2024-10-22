package com.core.day23.string.assigment;
import java.util.*;

// convert lower to upper and upper to lower

public class UpperLowerChange {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter String = ");
	String s=sc.nextLine();
	
	StringBuilder s1=new StringBuilder(s);
	System.out.println(s1);
		
	for(int i=0; i<s1.length(); i++) {
		char ch=s1.charAt(i);
		int asci=(int)ch;
		if(asci>=65 && asci<=91 || asci>=97 && asci<=122) {
		if(asci<97) {
			asci+=32;
			char small=(char)asci;
			s1.setCharAt(i, small);
		}else {
			asci-=32;
			char big=(char)asci;
			s1.setCharAt(i, big);
		}
		}
		
	}
	
	System.out.println(s1);
	
	}

}
