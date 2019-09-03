package file;

import java.util.Scanner;

public class CountNumberof_oddNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scn.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				count++;
			}
		}
System.out.println(count);
	}

}
