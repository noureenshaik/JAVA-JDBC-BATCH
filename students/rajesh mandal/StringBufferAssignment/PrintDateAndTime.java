package com.string.buffer.assignment;
import java.util.Calendar;
// 5.	Write a Java program to print current date and time in the specified format?
public class PrintDateAndTime {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
	      System.out.println("Current Date and Time :"); 
	      System.out.format("%tB %te, %tY%n", c, c, c);
	      System.out.format("%tl:%tM %tp%n", c, c, c);
		

	}

}
