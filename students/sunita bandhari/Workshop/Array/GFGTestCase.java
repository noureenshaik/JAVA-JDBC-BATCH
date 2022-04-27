package com.arraydemo1;

import java.util.Scanner;

public class GFGTestCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalTestCases, eachTestCaseValues;
		System.out.println("Enter values:");
		totalTestCases = sc.nextInt();
		int[][] arrayMain = new int[totalTestCases][];
		for (int i = 0; i < arrayMain.length; i++) {
			eachTestCaseValues = sc.nextInt();
			arrayMain[i] = new int[eachTestCaseValues];
			for (int j = 0; j < arrayMain[i].length; j++) {
				arrayMain[i][j] = sc.nextInt();
			}

		}
		for (int i = 0; i < arrayMain.length; i++) {
			int nEvenNumbers = 0, nOddNumbers = 0;
			System.out.println("TestCase " + i + " with " + arrayMain[i].length + " values:");
			for (int j = 0; j < arrayMain[i].length; j++) {
				System.out.println(arrayMain[i][j] + " ");
				if (arrayMain[i][j] % 2 == 0) {
					nEvenNumbers++;
				} else {
					nOddNumbers++;
				}
			}
			System.out.println();
			System.out.println("Total Even Numbers: " + nEvenNumbers + ", Total Odd Numbers: " + nOddNumbers);
		}

	}

}
