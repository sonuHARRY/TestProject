package Programmes;

import java.util.Scanner;

public class clock {

	public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
       System.out.println("enter  hour ");
       int hr=scn.nextInt();
       System.out.println("enter minute ");
       int min=scn.nextInt();
       
        double  hangle=hr*30 +min*0.5;
        double mangle=min*6;
        double angle=0.0;
             if(hangle>mangle)
                 {
    	       angle=hangle-mangle;
    	         }
             else
    	       angle=mangle-hangle;
             
         if(angle>180)
    	         angle=360-angle;
          System.out.println("angle between hour and minute is :" + angle );
	}

}
