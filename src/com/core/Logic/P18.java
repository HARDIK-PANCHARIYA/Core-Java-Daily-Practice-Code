package com.core.Logic;

public class P18 {
	
	public static void main(String[] args) {
		
		int no=45629;
		
		while(no>0) {
			int r=no%10;
			no=no/10;
			System.out.println(r*100);
		}
		
	}

}
