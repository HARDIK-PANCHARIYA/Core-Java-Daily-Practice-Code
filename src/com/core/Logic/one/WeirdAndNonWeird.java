package com.core.Logic.one;

import java.util.Scanner;

public class WeirdAndNonWeird {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print ("Enter Number : ");
		int no=sc.nextInt();
		
		if(no%2 != 0) {
			System.out.println("Weird");
		}else if(no%2==0 && no>=2 && no<=5) {
			System.out.println("Not Weird");
		}else if(no%2==0 && no>=6 && no<=20) {
			System.out.println("Weird");
		}else {
			System.out.println("Not Weird");
		}
		
	}

}
