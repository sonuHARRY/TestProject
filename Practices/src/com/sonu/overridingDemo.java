package com.sonu;
class Harryr
{
	int i=5;
public	void show()
	{
	
		System.out.println("in Harry");
	}
}
class Sonur extends Harryr
{
	int i;
	public void show()
	{
		i=9;
		super.show();
		System.out.println("in Sonu");
	}
}
public class overridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sonur s1=new Sonur();
s1.show();
System.out.println(s1.i);
	}

}
