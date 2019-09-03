package file;

public class Primenumber {

	public static void main(String[] args) {
		//primenumber
		int maxNum = 30;
		int count = 0;
		for(int i = 3; i <= maxNum; i++){
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					System.out.println(i + " is not a prime number.");
					
				} else if(j == (i - 1)){
					System.out.println(i + " is a prime number");
				}
			}
		}

	}

}
