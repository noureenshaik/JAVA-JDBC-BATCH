package stringBuilder;

//Write a Java program to get the name of the first and last day of a month.
import java.util.*;
import java.time.*;
import java.text.*;


public class GetFirstAndLastDayOfMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		YearMonth ym=YearMonth.of(2015,7);
		
		String firstDay = ym.atDay(1).getDayOfWeek().name();
		 String lastDay = ym.atEndOfMonth().getDayOfWeek().name();
		 System.out.println();
		 System.out.println(firstDay);
	 	 System.out.println(lastDay);
		 System.out.println();
		

	}

}


//output : WEDNESDAY , FRIDAY