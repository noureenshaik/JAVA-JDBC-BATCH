package com.date.time;

public class Exercise18 {
	   public static void main(String[] args)
	    {
	     //year to leap year or not
	       int year = 2016;
	       System.out.println();        
	       if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
	               System.out.println("Year " + year + " is a leap year");
	       else
	               System.out.println("Year " + year + " is not a leap year");
	               System.out.println();
	    }
	}
