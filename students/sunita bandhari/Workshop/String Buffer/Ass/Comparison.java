package com.stringbuffer;

public class Comparison {

	public static void main(String[] args) {
		String str1 = "Sunita";
		String str2 = "sunita";
		StringBuffer sb = new StringBuffer(str1);

		System.out.println("Comparision of "+str1+" and "+sb+" : "+str1.contentEquals(sb));
		System.out.println("Comparision of "+str2+" and "+sb+" : "+str2.equals(sb));

	}

}
