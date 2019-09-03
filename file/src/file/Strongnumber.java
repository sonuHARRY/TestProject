package file;

import java.util.Scanner;

public class Strongnumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int s = scn.nextInt();
		int c = s;

		int a = 0;
		int sum = 0;
		while (s > 0) {
			int re = s % 10;
			int fact = 1;
			for (int i = 1; i <= re; i++) {
	fact = fact * i;
            }
s = s / 10;
sum = sum + fact;

		}
		System.out.println(sum);

		if (sum == c) {
			System.out.println(c + " number is a strong number");
		} else {
			System.out.println(c + " number is not a strong number");
		}

	}
}
