package com.core.day23.string.assigment;
import java.util.*;

// print all the combination of string 

public class CharCombination {
	
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter String = ");
	String s=sc.nextLine();
	
	for(int i=0; i<s.length(); i++) {
		for(int j=i+1; j<=s.length(); j++) {
			System.out.print(s.substring(i,j)+" ");
		}
	}
}	

}
