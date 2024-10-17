package com.core.number.array.practice;
import java.util.*;

// find that array is sorted or not in ascending or descending order

public class FindArraySort {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		boolean asc=true;
		boolean dec=true;
		
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]>arr[i+1]) {
				asc=false;
			}else if(arr[i]<arr[i+1]){
				dec=false;
			}
		}
		
		if(asc && dec==false) {
			System.out.println("Array is sorted in Ascending  order");
		}else if(dec && asc==false) {
			System.out.println("Array is sorted in Descending order");
		}else{
			System.out.println("Array is not sorted in Ascending  and Descending order");
		}
		
		
	}

}
