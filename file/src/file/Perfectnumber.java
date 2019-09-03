package file;

import java.util.Scanner;

public class Perfectnumber {

	public static void main(String[] args) {
		// perfect number
				Scanner scn = new Scanner(System.in);
				int n = scn.nextInt();
				int p = 0;
				for (int i = 1; i <= n / 2; i++) {
					if (n % i == 0) {

						p = p + i;
					}
				}

				if (n == p) {
					System.out.println(n + "  number is perfect");
				} else {
					System.out.println(n + "  it is not a perfect number");
				}

	}

}
