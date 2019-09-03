package com.sonu;
interface writer
{
	abstract void write();
	
}
class pen implements writer
{
	public void write()
	{
		System.out.println("i m a pen");
	}
}
class pencil implements writer
{
	public void write()
	{
		System.out.println("i m a pencil");
	}
}
class kit
{
	void doSomething(writer p)
	{
	p.write();
		
	}}
public class interfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
kit k=new kit();
writer p=new pen();
writer p1=new pencil();
k.doSomething(p1);
	}

}
