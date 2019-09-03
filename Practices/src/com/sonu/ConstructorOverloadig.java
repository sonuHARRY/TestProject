package com.sonu;
class casion
{
int a;
int b;
String operation;
public casion(int i)
{
	a=i;
	}

public casion(int i,int j)
{
	a=i;
	b=j;
operation= "nothing";
}
public casion(int i,int j,String op)
{
	a=i;
	b=j;
operation=op;
}
}
public class ConstructorOverloadig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      casion c=new casion(8,9);
      System.out.println(c.a);
      System.out.println(c.b); 
	}

}
