package Programmes;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		int temp=0;
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scn.nextInt();
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			
				temp=temp+1;	
		}
            if(temp>0)
	          System.out.println(n +" is not a prime number.");
            else
              System.out.println(n +" is a prime number.");
	   
	}
}
