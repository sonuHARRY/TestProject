package file;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("enter the n value");
		int n=scn.nextInt();
		int copy=n;
		int rev=0;
		while(n>0){
			int re=n%10;
			rev=rev*10+re;
			n=n/10;
		
		}
			System.out.println(rev+" is the reverse number");
		}
}
