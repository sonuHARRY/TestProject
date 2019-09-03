package com.sonu;

public class EnhaunceForLoopDemo {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]= {5,2,3,89};
		int c[]= {5,6,7,8};
		int d[] []= {
				{1,2,3,4},
				{5,2,3},
				{5,6,7,8}
		             };
		for(int k[] : d)
		{
			for(int l:k)
			{
				System.out.print(" "+l);
			}
			System.out.println();
		}

	}

}
