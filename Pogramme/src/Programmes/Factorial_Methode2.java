
package Programmes;

import java.util.Scanner;

//using recursion method

public class Factorial_Methode2 {
public static int fact(int n)
{
	/*
	 * logic is n=5 then
	 * 5!=5*4!
	 * 4!=4*3!       n is a number then n!=n*(n-1)!
	 * 3!=3*2!
	 * 2!=2*1!
	 * 1!=1*0!
	 */
	if(n==0)                             
		return 1;
	else
		 return n*fact(n-1);
}
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
        System.out.println("enter a number");
        int n=scn.nextInt();
        System.out.println(n+"!="+fact(n));
	}

}
