package file;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// primenumber
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int count=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				count++;
				
			}
		} if(count==2){
				System.out.println(n +" it is prime");
			}
			else{
				System.out.println(n +" is not prime");
			}
		

	}

}
