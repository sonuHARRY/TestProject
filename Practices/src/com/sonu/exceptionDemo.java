package com.sonu;

public class exceptionDemo {

	public static void main(String[] args) {
		try {
			int b[]=null;
		//int a[]=new int[8];
			b[5]=8;
		int i=7;
		int j=0;
		int k=i/j;
		
		System.out.println("output is:"+k);	
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println("stay in ur limit..");
		}
		catch(ArithmeticException e)
		{
			System.err.println("u cant divided by zero ");
		}catch(Exception e)
		{
			System.out.println("u cant put null");
		}
		finally
		{
System.out.println("finally blocks are always executed");
		}
	}

}
