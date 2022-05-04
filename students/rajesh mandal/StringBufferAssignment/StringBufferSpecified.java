package com.string.buffer.assignment;

//Write a Java program to compare a given string to the specified string buffer?
public class StringBufferSpecified {

	public static void main(String[] args) {
		String str1 = "rajesh", str2 = "Rajesh";
	    StringBuffer strbuf = new StringBuffer(str1);
	    
	    System.out.println("Comparing "+str1+" and "+strbuf+": " + str1.contentEquals(strbuf));
	    
	    System.out.println("Comparing "+str2+" and "+strbuf+": " + str2.contentEquals(strbuf));
	    

	}

}
