package com.core.method.logic;

/*

 write a method to show the number is Niven or not 
 Niven number means which is divisible by the sum of its digits
 eg -- int y=126
 	-- 1 + 2 + 6 = 9
 	-- 126/9 = 0  Niven or not Niven

 */
public class Mq4 {
	
	int r=0;
	int sum=0;
	
	int niven(int no) {
		while(no>0) {
			r=no%10;
			no=no/10;
			sum+=r;
		}
		return sum;
	}
	
	void cheakNiven(int sum ,int no) {
		if(no%sum==0) {
			System.out.println("The "+no+" is Niven number ");
		}
		else
		System.out.println("The "+no+" is not Niven numberr");
	}

}
