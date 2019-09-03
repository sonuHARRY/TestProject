package Programmes;

import java.util.Scanner;

public class Factorial {

	
	public static void main(String[] args) {
	int fact=1;
	
	Scanner scn=new Scanner(System.in);
	
System.out.println("enter a number");
int n=scn.nextInt();
for(int i=1;i<=n;i++)
{
	fact=fact*i;
}
System.out.println(n+"!="+ fact );
	}

}
