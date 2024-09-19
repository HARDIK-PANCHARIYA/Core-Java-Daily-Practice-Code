package com.core.number.system;

import java.util.Scanner;

// Unique Number ---- here are no repeated digits in the number

// 20 ,56 ,45 ,21

public class UniqueNumber {
	
	public boolean unique(int no) {
		boolean result=true;
		int updateno;
		while(no>0) {
			int rem=no%10;
			no=no/10;
			updateno=no;
			while(updateno>0) {
				int r=updateno%10;
				updateno/=10;
				if(rem==r) {
					result=false;
					break;
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number = ");
		int no=sc.nextInt();
		
		UniqueNumber obj=new UniqueNumber();
		
		if(obj.unique(no)==true) {
			System.out.println(no+" is Unique Number");
		}else{
			System.out.println(no+" is not Unique Number");
		}
	}
	

}
