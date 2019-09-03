package Programmes;

import java.util.Scanner;

public class name {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scn.nextInt();
		
		if(n%3==0 & n%5==0)
			System.out.println("tanya weds joseph");
		else if(n%3==0)
			System.out.println("tanya");
		else if(n%5==0)
			System.out.println("joseph");
		else
			System.out.println("no name matched");
	}

}
