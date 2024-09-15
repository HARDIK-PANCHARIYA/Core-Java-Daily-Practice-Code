package com.core.Logic;

// ip=1234
// op=4
//	  3
//	  2
//	  1

public class P13 {
	
	public static void main(String[] args) {
		
	int no=1234;
	int  r=0;
	while(no>0) {
		int digit=no%10;
		r=r*10+digit;
		no /=10;
		System.out.println(r);
	}
	}

}
