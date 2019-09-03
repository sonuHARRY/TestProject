package file;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("enter the n value");
		int n=scn.nextInt();
		int copy=n;
		int sum=0;
		int mul=0;
		while(n>0){
			int re=n%10;
				mul=re*re*re;//fact=fact+(re*re*re);
			sum=sum+mul;
			n=n/10;
		}
				System.out.println(sum);
			if(sum==copy){
				System.out.println(sum+" number is Amstrong");
			}else{
				System.out.println(sum+" number is not Amstrong");
			}

	}

}
