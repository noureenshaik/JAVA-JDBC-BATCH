package com.interviewExample;

public class reverseStringWithoutUsingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Automation";
		StringBuilder str2 = new StringBuilder();
		str2.append(str);
		str2 = str2.reverse();
		System.out.println(str2);

	}

}
