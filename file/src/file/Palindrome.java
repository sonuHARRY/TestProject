package file;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("enter the n value");
		int n=scn.nextInt();
		int copy=n;
		int sum=0;
		int rev=0;
		while(n>0){
			int re=n%10;
			sum=sum*10+re;
			 n=n/10;
		}
		//rev=sum;
		if(sum==copy){
			System.out.println(sum+ " palindrome");
		}
		else{
		System.out.println(copy+ " not palindrome");	
		}
		

	}

}
