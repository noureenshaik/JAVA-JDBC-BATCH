package com.arraydemo1;

public class OneDimensionalArrayString {

	public static void main(String[] args) {
		String[] strArray = { "Alive is Awesome", "Be in Present", "Be Yourself" };
		System.out.println("The length of String array is: " + strArray.length);
		System.out.println("Displaying One dimensional String array elements:");
		for (int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i] + "\t");
		}
	}

}
