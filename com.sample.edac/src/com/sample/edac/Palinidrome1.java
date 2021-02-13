package com.sample.edac;

public class Palinidrome1 {

	

		public static void main(String[] args) {
			int r,sum=0, temp ;
			
			int n = 1331;
			temp = n;
			
			while(n>0) {
				
			r =n % 10 ;
			sum = (sum * 10)+r;
			n= n/10;
			
				
			}
			if(sum==temp)
			System.out.println("number is palinidrome");
			else
			System.out.println("number is not palindrome");	
		}
		
	}


