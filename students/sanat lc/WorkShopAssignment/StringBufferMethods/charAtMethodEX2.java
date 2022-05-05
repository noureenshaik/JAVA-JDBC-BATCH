package com.StringBuffer;

public class charAtMethodEX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder str= new StringBuilder("WelcomeGeeks");
		
		System.out.println("String is "+ str.toString());
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			System.out.println("Char at Position " +i + " is  " +ch);
		}
	}

}
