package com.stringbuffer;

public class StringBufferEx4 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Geek");
		char ch = sb.charAt(1);
		System.out.println("StringBuilder Object"+ " contains = " + sb);
		System.out.println("Character at Position 1"+ " in StringBuilder = " + ch);
		for(int i=0; i<sb.length(); i++) {
			ch = sb.charAt(i);
			System.out.println("Character at position "+i+" is "+ch);
			
		}
	}

}
