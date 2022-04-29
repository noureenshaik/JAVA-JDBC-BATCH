package com.stringbuffer;

public class StringBufferEx1 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		sb.append("Java");
		System.out.println(sb);
		sb.insert(1, "People");
		System.out.println(sb);
	}

}
