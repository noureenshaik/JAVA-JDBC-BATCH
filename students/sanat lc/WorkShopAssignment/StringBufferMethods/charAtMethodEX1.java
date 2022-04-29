package com.StringBuffer;

public class charAtMethodEX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder str= new StringBuilder();
		str.append("Geek");
		
		char ch=str.charAt(1);
		System.out.println("StringBuilder Object"+ "Contains= "+str);
		System.out.println("Character at Position 1"+"In StringBuilder= "+ch);
	}

}
