package com.sonu;
class Test3
{
	public void show()
	{
		System.out.println("in show");
	}
	}
class abc extends Test3
{
	public void show()
	{
		System.out.println("Annonymous inner class1 ");
	}
	}

public class annonymousDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test3 t1=new abc()
{
	public void show()
	{
		System.out.println("Annonymous inner class2");
	}
	};
t1.show();
	}

}
