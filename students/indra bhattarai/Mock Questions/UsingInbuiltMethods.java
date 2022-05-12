package com.mockquestions;

public class UsingInbuiltMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "Indra Bhattarai";
		
		char chars[] = str.toCharArray();   
		// converted to character array and printed in the reverse order
		
		
		for (int i = chars.length-1; i&gt; =0; i--) {
			System.out.println(chars[i]);
		}
	}

}
