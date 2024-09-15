package com.core.Logic;

//ip=1234;
//op=4
//   34
//   234
//   1234

public class P15 {
	
	public static void main(String[] args) {
		int no=1234;
		for(int i=10; i<=no*10; i=i*10) {
			System.out.println(no%i);
		}
	}

}
