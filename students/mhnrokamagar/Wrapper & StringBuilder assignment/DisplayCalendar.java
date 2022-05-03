package stringBuilder;

//Write a Java program to get and display information (year, month, day, hour, minute) of a default calendar.

import java.util.*;

public class DisplayCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a default calendar
		
		Calendar cal=Calendar.getInstance();
		
		//Get and display information of current date from the calendar.
		
		System.out.println();
		
		System.out.println("Year:"+ cal.get(Calendar.YEAR));
		System.out.println("Month:"+ cal.get(Calendar.MONTH));
		System.out.println("Day:"+ cal.get(Calendar.DATE));
		System.out.println("Hour:"+ cal.get(Calendar.HOUR));
		System.out.println("Minute:"+ cal.get(Calendar.MINUTE));
		

	}

}


//output:  
//Year:2022
//Month:3
//Day:29
//Hour:10
//Minute:31
