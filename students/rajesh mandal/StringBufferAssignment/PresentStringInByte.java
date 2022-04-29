package com.string.buffer.assignment;
// import java.util.Calendar;
// 6.	Write a Java program to get the contents of a given string as a byte array?
public class PresentStringInByte {

	public static void main(String[] args) {
		
	        String str = "This is a sample String.";

	        // Copy the contents of the String to a byte array.
	        byte[] byte_arr = str.getBytes();

	        // Create a new String using the contents of the byte array.
	        String new_str = new String(byte_arr);

	        // Display the contents of the byte array.
	        System.out.println("\nThe new String equals " +
	            new_str + "\n");
		

	}

}
