package com.core.Logic;

//ip=1234
//op=4
//	 43
//	 432
//	 4321

public class P14 {
	public static void main(String[] args) {
	int no=1234;
	int r=0;
	while(no>0) {
		int rem=no%10;
		r=r*10+rem;  // use of reversing the number
		System.out.println(r);
		no/=10;
	}
	
		}
	}
