package com.core.number.system;

import java.util.*;

// special no

// 145 -- > 1!+4!+5!=145


public class SpecialNumber {
	
	public boolean specialno(int no) {
		
		
		int sum=0;
		int orgno=no;
		
		boolean result=false;
		
		for(int i=no; no>0; i++) {
			int rem=no%10;
			no=no/10;
			
			int fact=1;
			for(int j=1; j<=rem; j++) {
				fact*=j;
			}
			sum+=fact;
		}
		
		if(sum==orgno) {
			result=true;
		}
		
		return result;
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter  no to find special no = ");
		int no=sc.nextInt();
		
		SpecialNumber sn=new SpecialNumber();
		if(sn.specialno(no)==true) {
			System.out.println(no+" is Special number");
		}else {
			System.out.println(no+" is no Special number");
		}
		
		
	}

}
