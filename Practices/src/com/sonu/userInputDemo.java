package com.sonu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class userInputDemo {

	public static void main(String[] args) throws Exception {
		int n;
	System.out.println("enter a number");

try (BufferedReader  br=new BufferedReader(new InputStreamReader(System.in)))//where u dont ant to use catch and finally block
		{
n=Integer.parseInt(br.readLine());
        }
//catch(Exception e)
//    {
//	System.out.println(e);
//	}
//finally
//{
//	br.close();
//	System.out.println("closed resources");
//	}
System.out.println(n);
	}

}
