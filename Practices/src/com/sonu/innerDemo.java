package com.sonu;
class outer
{
int a;
public void show()
{
	

}

  static class inner                  //outer$inner.class
  {
	  public void display()
	  {
		  System.out.println("in display");
	  }
  }
}
public class innerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
outer obj=new outer();
obj.show();
outer.inner obj1=new outer.inner();
obj1.display();
	}

}
