package stringBuilder;

//Write a Java program to calculate your age.


import java.time.*;
import java.util.*;


public class CalculateYourAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// date of birth
		LocalDate pdate=LocalDate.of(1990, 11, 22);
		
		//current date
		LocalDate now=LocalDate.now();
		
		//difference between current date and date of birth
		
		Period diff=Period.between(pdate, now);
		
		System.out.printf("\nI am  %d years, %d months and %d days old.\n\n",diff.getYears(), diff.getMonths(), diff.getDays());

	}

}

//output :  I am  31 years, 5 months and 7 days old.