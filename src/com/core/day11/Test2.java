package com.core.day11;

public class Test2 {
		
		public static void main(String[] args) {
			
			for(int i=1; i<=5; i++) {
				
				for(int j=65; j<=69; j++) {
					
					System.out.print((char)j+" ");
				}
				System.out.println();
			}
			
			System.out.println("-------------- Another Method -------------------------");
			
			for(int i=1; i<=5; i++) {
				
				for(char ch='A'; ch<='E'; ch++) {
					
					System.out.print(ch+" ");
				}
				System.out.println();
			}
			
			
		

	}

}
