package com.sonu;

 class A
{
public A()
{
System.out.println("in A");	
}

public A(int i)
{
System.out.println("in A of int");	
}
}
 class B extends A
 {
	 public B()
	 {
		 super(6);
	 System.out.println("in B");	
	 } 
	 
	 public B(int i)
	 {
		 super(i);
	 System.out.println("in B of int");	
	 }
 }
public class superDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B b1=new B();
	}

}
