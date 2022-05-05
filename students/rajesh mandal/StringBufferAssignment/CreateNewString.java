package com.string.buffer.assignment;
// 2.	Write a Java program to create a new String object with the contents of a character array?
public class CreateNewString {

	public static void main(String[] args) {
		 // Character array with data.
        char[] arr_num = new char[] { '1', '2', '3', '4' };

        // Create a String containig the contents of arr_num
        // starting at index 1 for length 2.
        String str = String.copyValueOf(arr_num, 1, 3);

        // Display the results of the new String.
        System.out.println("\nThe book contains " + str +" pages.\n");
		

	}

}
