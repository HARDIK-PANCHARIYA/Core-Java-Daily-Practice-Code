package com.core.number.system;
import java.util.*;


// spy number ----  the sum and product of its digits are equal

// 123 -- > 1+2+3=6  == 1*2*3=6

public class SpyNumber {
	
	
	public boolean spyno(int no) {
		
		boolean result=false;
		int sum=0;
		int pro=1;
		for(int i=no; no>0; i++) {
			
			int rem=no%10;
			no=no/10;
			
			sum+=rem;
			pro*=rem;
			
		}
		
		if(sum==pro) {
			result=true;
		}
		
		return result;	
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number = ");
		int no=sc.nextInt();
		
		SpyNumber sn=new SpyNumber();
		
		if(sn.spyno(no)==true) {
			System.out.println(no+" is spy number");
		}else {
			System.out.println(no+" is not spy number");
		}
	}

}
