package com.core.number.system;

// Find the no of prime no in given array

public class PrimeNoINArray {
	
	public static boolean checkPrime(int no) {
		int count =0;
		if(no==1)
			return false;
		else {
		for(int i=1; i<=no; i++) {
			if(no%i==0) {
				count++;
			}
		}
		return count==2 ? true : false;
		}
	}
	
	public static void main(String[] args) {
		
		int a[] = {52,78,23,14,5,1,412,15,11};
		for(int i=0 ; i<a.length; i++) {
			if(checkPrime(a[i])) {
				System.out.println(a[i]+" is a prime no ");
			}
		}
		
	}

}
