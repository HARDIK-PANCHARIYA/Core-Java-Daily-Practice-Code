package com.core.day11;

public class Todaylearning {
	
	public static void main (String args[]) {
		
/*
 1 2 3
 4 5 6
 7 8 9		
 */
		for(int i=1; i<=9; i++) {
			System.out.print(i+" ");
			if(i%3==0) {
				System.out.println();
			}
		}
		
		System.out.println("-------------------------------------------");
		
/*
 Print the number given to the specific character	-----> Imp  (  (int) a1  )	
 */
		
		char a1='A';
		int a2=(int) a1;
		System.out.println("A = "+a2);
		
		System.out.println("========================================================");

		
/*
 Type casting char to number -------> imp ( (char)a )
 */
		System.out.println("Type casting char to number "+"\n");
		int a = 65;
		char ch= (char) a;
		System.out.println(ch);
		
		System.out.println("\n"+"---------------------------------------");
		
/*
 Type casting  65 to 90  -----> A,B,C....Z  
 */
		
		System.out.println("Type casting  65 to 90  ----- A,B,C....Z \n");
		for(int i=65; i<=90; i++) {
			System.out.print((char)i+" ");
		}
		System.out.println("\n-------------------------------------------------");
		
/*
Type casting  97 to 112  -----> a,b,c....z  
*/		
		
		System.out.println("Type casting  97 to 122  ----- a,b,c....z \n ");
		for(int i=97; i<=122; i++) {
			System.out.print((char)i+" ");
		}
		System.out.println("\n----------------------------------------- \n");
		
/*
String to single Character  -----> imp  (  s1.charAT(i)   )
*/
		String s1="Hardik Panchariya";
		for(int i=0; i<s1.length(); i++) {
			System.out.print("i("+i+")"+ "= "+s1.charAt(i)+", ");
		}
		System.out.println("---------------------------------------------------------\n");
		
/*
GOODMORNING =

GGG
OOO
OOO
DDD
MMM
OOO
RRR
NNN
III
NNN
GGG		
 */
		
		String s2="GOODMORNING";
		for(int i=0; i<s2.length();i++) {
			for(int j=1; j<=3; j++) {
				System.out.print(s2.charAt(i));
			}
			System.out.println();
		}
		System.out.println("===============================");
		
/*
 
INDIA=

IIIII
NNNNN
DDDDD
IIIII
AAAAA
 */
		String s3="INDIA";
		for(int i=0; i<s3.length(); i++) {
			for(int j=0; j<=5; j++) {
				System.out.print(s3.charAt(i));
			}
			System.out.println();
		}
		System.out.println("----------------------------------------------");
		
		
/*
A B C D E 
A B C D E 
A B C D E 
A B C D E 
A B C D E 
 */
		
		for(int i=1; i<=5; i++) {
			
			for(char chr='A'; chr<='E'; chr++) {
				
				System.out.print(chr+" ");
			}
			System.out.println();
		}
		
	}

}
