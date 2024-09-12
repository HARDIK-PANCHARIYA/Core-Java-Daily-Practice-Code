package com.core.Logic;

//  Take user input
// Convert it into KM MM CM

import java.util.*;

public class P2 {
	
	public static void main (String [] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number = ");
		float a=sc.nextInt();
		
		float MM=a;
		float CM=a/10;
		float KM=a/1000000;
		
		System.out.println("MM = "+MM);
		System.out.println("CM = "+CM);
		System.out.println("KM = "+KM);
		
	}

}
