package com.sonu;
//@FunctionalInterface//using for only one method
interface Test5                                //there are 3 interface
               
{                                                 //1.normal
	public void show();                           //2. single astract
                                                  //3.	marker interface
	
}
public class lambdaExpressionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test5 t1=()->System.out.println("i m d best");//Lambda Expression /it is only used in Functional anonymous interface
t1.show();
	}

}
