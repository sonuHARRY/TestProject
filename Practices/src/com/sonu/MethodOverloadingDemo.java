package com.sonu;
class casio
{
	public void add(int i,int j)
	{
		System.out.println(i+j);	
	}
	public void add(int i,int j,int k)
	{
		System.out.println(i+j+k);	
	}
	public void add(float i,float j)
	{
		System.out.println(i+j);	
	}
	public void add(double i,double j)
	{
		System.out.println(i+j);	
	}
}
public class MethodOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
casio c=new casio();
c.add(5,7);
c.add(5.8f,7.9f);
c.add(5.8,7.5);
	}

}
