package com.Exception;



import java.util.Scanner;

class InsufficientBalException extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
class Account
{
	double bal;
 double n;
	 
	Account(double bal)
	{
		this.bal=bal;
		
	}

void withdraw(int amt) throws InsufficientBalException
{
	if(amt>bal)
	{
		throw new InsufficientBalException();
	}

}
public static class AccountDemo {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the amount");
		Account a1=new Account(2000);
		int amt=scn.nextInt();
		
		try
		{
		a1.withdraw(amt);	
		System.out.println("amount withdrawn");
		}catch(InsufficientBalException e)
		{
			System.out.println("insufficient balance");
		}
		finally
		{
			scn.close();
		}
		
	}

}
}