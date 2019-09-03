package com.sonu;
class cal
{
	public int add(int ...n)
	{
		int sum =0;
		for(int i:n)
		{
			sum=sum+i;
		}
		return sum;
		
		
	}
	}
public class varargsDemo {

	public static void main(String[] args) {
		cal c=new cal();
		int k=c.add(7,7,8,9,1);
System.out.println("Sum of all numbers :" +k);
	}

}
