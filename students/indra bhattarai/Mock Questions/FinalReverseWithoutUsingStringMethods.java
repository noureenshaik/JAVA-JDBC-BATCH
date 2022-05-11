package com.mockquestions;

public class FinalReverseWithoutUsingStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Indra";
		StringBuilder str2 = new StringBuilder();
		str2.append(str);
		str2 = str2.reverse();
		System.out.println(str2);
	}

}
