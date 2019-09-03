package com.sonu;

public class Array2dDemo {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]= {5,2,3,89};
		int c[]= {5,6,7,8};
		int d[] []= {
				{1,2,3,4},
				{5,2,3},
				{5,6,7,8}
		             };
		for(int i=0;i<d.length;i++)
		{
			for(int j=0;j<d[i].length;j++)
			{
				System.out.print(" "+d[i][j]);
			}
			System.out.println();
		}
	}

}
