package Programmes;


public class primeMethod {
	static boolean isPrime(int num)
	{
		int i=2;
		while(i<=num/2)
		{
			if(num%i==0)
		return false;
			i++;
		}
		return true;
		

	}
	public static void main(String[] args) {
	
boolean b=isPrime(5);
if(b)
	System.out.println("prime");
else
	System.out.println("not prime");
	}

}
