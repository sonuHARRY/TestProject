package file;

import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String[] args) {
		// prime number

				Scanner scn = new Scanner(System.in);
				int n = scn.nextInt();
			int i;
				for( i=2;i<n;i++)
					if(n%i==0)
							break;
					 if(i==n)
							System.out.println( n +" no is  prime");
								else
							System.out.println(n + " no is not prime");

	}

}
