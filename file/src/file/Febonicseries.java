package file;

public class Febonicseries {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=a+b;
		System.out.println(c);
		while(c<10){
			a=b;
			b=c;
			c=a+b;
			System.out.println(c);
		}
	}

}
