package com.string;

public class StringDemo4 {

	public static void main(String[] args) {
	    String first = "java programming";
	    String second = "JAva programming";
	    String third = "python programming";

	    // compare first and second strings
	    boolean result1 = first.equalsIgnoreCase(second);
	    System.out.println("Strings first and second are equal: " + result1);

	    // compare first and third strings
	    boolean result2 = first.equals(third);
	    System.out.println("Strings first and third are equal: " + result2);

	}

}
