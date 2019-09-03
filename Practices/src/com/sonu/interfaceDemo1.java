package com.sonu;
interface sonu
{
	void dream();
	 default void habbit()
	{
		System.out.println("sonu is playing criket");
	}
	 default void interest()
		{
			System.out.println("gaming");
		}
}
interface harry
{
	default void habbit()
	{
		System.out.println("harry is playing criket");
	}}
class s implements sonu,harry
{
//	public  void habbit()
//	{
//		System.out.println("harry and sonu is playing criket");
//	}
	
	public void dream() {
		System.out.println("getting dream job");
		
	}
	public void interest()
	{
		System.out.println("new gaming");
	}
	@Override
	public void habbit() {
		// TODO Auto-generated method stub
		sonu.super.habbit();
	}
}
public class interfaceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sonu s1=new s();
s1.dream();
s1.habbit();
s1.interest();
	}

}
