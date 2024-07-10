package com.core.day14ArraySorting;

public class Givenquestion {
	
	public static void main(String[] args) {
		
		int a[]= {9,18,17,14,19,4};
		int sum=0;
		
		//Calculate sum of all number which are divisible by 7
		
		for(int i=0; i<a.length; i++) {
			if(a[i]%7==0) {
				sum=sum+a[i];
			}
		}
		
		System.out.println("Total sum  which are divisible by 7 = "+sum);
		
		System.out.println("=================================================================");
		
		
		// Find all the number which are less than 15 and compute their addition
		
		int sum2=0;
		for(int i=0; i<a.length; i++) {
			if(a[i]<15) {
				sum2=sum2+a[i];
				System.out.println("Number less than 15 are = "+a[i]);
			}
		}
			System.out.println("Total sum which are less than 15 = "+sum2);
			
			System.out.println("===============================================================");
			
			
			// sort the array in acceding order
			
			for(int i=0; i<a.length-1; i++) {
				for(int j=i; j<a.length-1; j++) {
				if(a[i]>a[j+1]) {
					int t=a[i];
					a[i]=a[j+1];
					a[j+1]=t;
					}
				}
			}
			
			for(int i=0; i<a.length; i++) {
				System.out.println(a[i]);
			}
			
			System.out.println("Even number present in array = ");
			for(int i=0; i<a.length; i++) {
				if(a[i]%2==0) {
					System.out.print(a[i]+" ");
				}
			}
			
			
	}

}
