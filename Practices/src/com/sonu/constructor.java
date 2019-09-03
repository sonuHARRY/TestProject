package com.sonu;

public class constructor 
{
int a;
int b;
constructor()
{
a=9;
b=8;

}
constructor(int num1,double num2)
{
	a=num1;
	b=(int)num2;
}
constructor(int a,int b)
{
	this.a=a;
	this.b=b;

}
public static void main(String args[])
{
	
constructor c=new constructor(5,8);

System.out.println(c.a);
System.out.println(c.b);
}
}
