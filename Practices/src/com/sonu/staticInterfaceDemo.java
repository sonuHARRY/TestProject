package com.sonu;
interface Demo
{
	int i=9;
	void abc();
static void Show() {
	
	System.out.println("hi sonu");
}

}
class Demoimp implements Demo
{

	@Override
	public void abc() {
		
		System.out.println("hii harry");
	}
	
}
public class staticInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Demo.Show();
Demoimp d=new Demoimp();
d.abc();
System.out.println(Demo.i);
	}

}
