package Programmes;

import java.util.Scanner;

public class Fibonassi {

	public static void main(String[] args) {
	int a=1 ,b=1;

	int k=0;
	Scanner scn=new Scanner(System.in);
	System.out.println("enter a number");
	int n=scn.nextInt();
	System.out.print("1 1 ");
	while(k<=n )
	{
		k=a+b;
		if(k>n)
			break;
		System.out.print(k + " ");
        a=b;
        b=k;
	}
	}
}
