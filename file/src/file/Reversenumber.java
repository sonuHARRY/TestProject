package file;

public class Reversenumber {

	public static void main(String[] args) {
		// reverse number
				int i = 1432, y = 0, p = 0;
				while (i > 0) {
					y = i % 10;
					p = p * 10 + y;
					i = i / 10;
				
				}
				System.out.println(p);

	}

}
