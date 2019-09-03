package file;

import java.util.Scanner;

public class Divisibleby3 {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
			int s=scn.nextInt();
			
				if(s%3==0){
System.out.println(s + " divisiable by 3");
				}
				else{
					System.out.println(s + " not divisible by 3");
				}
			}
	}


