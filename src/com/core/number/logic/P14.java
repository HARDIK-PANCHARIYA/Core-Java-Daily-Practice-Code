package com.core.number.logic;

// check where no is unique or not

public class P14 {
	
	
	
	
	public static void main(String[] args) {
		
	int no=12285;
	String s=Integer.toString(no);  // to calculate the length of the integer number
	int len=s.length();
	int arr[]=new int[len];
	boolean result=true;
	
	for(int i=0; no>0; i++) {
		int rem=no%10;
		no=no/10;
		int count=0;
		count+=i;
		
		System.out.println(count);
		arr[count]=rem;	
	}
	
	for(int i=0; i<arr.length-1; i++) {
		for(int j=i+1; j<arr.length; j++) {
			if(arr[i]==arr[j]) {
				result = false;
			}
		}	
	}
	
	if(result==true) {
		System.out.println("no is unique");
	}else {
		System.out.println(" no is not unique");
	}
	
	

}
}