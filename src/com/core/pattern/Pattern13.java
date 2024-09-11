package com.core.pattern;

public class Pattern13 {
	
	public static void main(String[] args) {
		
		int n=4;
		
		for(int i=0 ; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				System.out.print(" ");
			}
			String str = String.valueOf((int)Math.pow(11, i));
			
			for(int j=0; j<str.length(); j++) {
				System.out.print(str.charAt(j)+" ");
			}
			System.out.println();
		}
		
		for(int i=n-2; i>=0; i--) {
			for(int j=i; j<=n-2; j++) {
				System.out.print(" ");
			}
			String str = String.valueOf((int)Math.pow(11, i));
			
			for(int j=0; j<str.length(); j++) {
				System.out.print(str.charAt(j)+" ");
			}
			System.out.println();
		}
		
	}

}
