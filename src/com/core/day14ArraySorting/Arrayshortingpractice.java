package com.core.day14ArraySorting;

//  Reverse the array 

public class Arrayshortingpractice {
	
	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50,60};
		
		for(int i=0; i<a.length/2; i++) {
			
			int t=a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=t;
				
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		
		System.out.println("==================================================================");
		
//  Find the biggest no in give array
		
		int a1[]= {10,20,40,50,30};
		int biggest=a1[0];
		
		for(int i=0; i<a1.length; i++) {
			
			if(biggest<=a1[i]) {
				biggest=a1[i];
				
			}
			
		}
		System.out.println("The Biggest number in array = "+biggest);
		
		
		System.out.println("===========================================================================");

// Find the Smallest no in give array
		
		int a2[]= {90,20,40,50,10,30};
		int smallest=a2[0];
		
		for(int i=0; i<a2.length; i++) {
			
			if(smallest>=a2[i]) {
				smallest=a2[i];
			}
		}
		System.out.println("The Samllest number in the array = "+smallest);
		
		System.out.println("=============================================================================");
		
// Sort the array in ascending order
		
		int a3[]= {90,20,40,50,10,30};
		
		for(int j=0; j<a3.length-1; j++) {
		for(int i=j; i<a3.length-1; i++) {
			if(a3[j]>=a3[i+1]) {
				int t=a3[j];
				a3[j]=a3[i+1];
				a3[i+1]=t;
			}
		}
		}
		
		for(int i=0; i<a3.length; i++) {
			System.out.println(a3[i]);
		}
		
		System.out.println("===========================================================================");
	
//  Sort the array in deciding order	
		
		int a4[]= {20,40,50,10,90,30};
		
		for(int j=0; j<a4.length-1; j++) {
		for(int i=j; i<a4.length-1; i++) {
			if(a4[j]<=a4[i+1]) {
				int t=a4[j];
				a4[j]=a4[i+1];
				a4[i+1]=t;
			}
			
		}
		}
		for(int i=0; i<a4.length; i++) {
			System.out.println(a4[i]);
		}
	
	}


}

