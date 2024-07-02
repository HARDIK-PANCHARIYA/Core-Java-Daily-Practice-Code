package com.core.day12;

import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
		
		for(int no=11; no<=1111111; no=no*10+1) {
			
			System.out.println(no);
		}
		
		System.out.println("--------------------------------------------------------------------------------------");
		
		for(int no=11; no<111111; no=no*10+1) {
			
			System.out.println(no*no);
		}
		
		System.out.println("-------------------------------------------------------------");
		
		for(int no=11; no<=1111111; no=no*10+1) {
			
			System.out.println(no*11);	
		}
		
		System.out.println("-----------------------------------------------------------");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no = ");
		int no=sc.nextInt();
		
		int fact=1;
		
		for(int i=1; i<=no; i++) {
			fact=fact*i;
			
		}
		System.out.println(fact);
		
		System.out.println("-----------------------------------------------------------------------");
		
		for(int i=270; i<=500; i++) {
			if((i%2!=0)) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println("\n"+"------------------------------------------------------------------------");
		
		
		
		int no2=4758;
		for(int i=10; no2>=no2; i=10*i) {
			System.out.println(no2%i);
		if(no2==no2%i) {
				break;
			}
		}
		
		System.out.println("----------------------------------------------------------------------");
		
		int no3=56732;
		for(int i=1; i<=5; i++) {
			System.out.println(no3%10);
			no3=no3/10;
		}
		
		System.out.println("------------------------------------------------------------------------");
		
		/*
		 56789
		 999
		 888
		 777
		 666
		 555
		 */
		
		int no4=56789;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=3; j++) {
				System.out.print((no4%10));
				
			}
			no4=no4/10;
			System.out.println();
		}
		
		
		
		
		
	}

}
