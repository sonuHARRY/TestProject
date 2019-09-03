package Programmes;

import java.util.Scanner;

public class specialNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the 2digit numbers");
		int n=scn.nextInt();
		
		
		 if(n%10 * (n/10) + n/10 + n%10==n)
			 System.out.println(n +" is a special number");
		 else
			System.out.println(n +" is not a specia; number");
		}
	}


