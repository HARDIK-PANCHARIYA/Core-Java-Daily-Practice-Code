package com.core.Logic;

//   1+1=2,1+2=3,3+2=5,5+3=8,8+5=13,13+8=21.....

public class P19 {
	public static void main(String[] args) {
		
	int sum=0;
	int n1=0;
	int n2=1;
	
	
	for(int i=0; i<=18; i++) {
		sum=n1+n2;
		n1=n2;
		n2=sum;
		
		System.out.println(sum);
	}
}
}
