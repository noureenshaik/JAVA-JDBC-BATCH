package stringBuilder;
//Write a Java program to get a date after 2 weeks.

import java.util.*;


public class GetDateAfter2Weeks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//two weeks
	     int noOfDays = 14; 
	     Calendar cal = Calendar.getInstance();
	     Date cdate = cal.getTime();
	     cal.add(Calendar.DAY_OF_YEAR, noOfDays);
	     Date date = cal.getTime();
	     System.out.println("\nCurrent Date: " + cdate+"\n");  
	     System.out.println("Day after two weeks: " + date+"\n");  

	}

}

//output: 
//Current Date: Fri Apr 29 23:04:50 EDT 2022

//Day after two weeks: Fri May 13 23:04:50 EDT 2022
