package com.sonu;
abstract class  Human
{
	public abstract void  eat();
public void walk()
{
	System.out.println("walking");
}
}
 class Man extends Human
{
	public void eat()
	{
		System.out.println("eating");
	}

}
public class abstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Human h1=new Man();
h1.eat();
h1.walk();
	}

}
