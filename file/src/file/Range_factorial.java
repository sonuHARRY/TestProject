package file;

import java.util.Scanner;

public class Range_factorial {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("enter the n value");
		int n=scn.nextInt();
		
		for(int j=1;j<=n;j++){
			int fact=1;
		for(int i=1;i<=j;i++){
			fact =fact*i;
		}
		System.out.println(j+"!"+"="+fact);
		}
	}

}
