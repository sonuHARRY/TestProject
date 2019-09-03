package file;

public class Sumnumber {

	public static void main(String[] args) {
		// sum of digits
		int i = 123455, r = 0, p = 0;

		while (i > 0) {
			r = i % 10;
			p = p + r;
			i = i / 10;
		}
		System.out.println(p);

	}

}
