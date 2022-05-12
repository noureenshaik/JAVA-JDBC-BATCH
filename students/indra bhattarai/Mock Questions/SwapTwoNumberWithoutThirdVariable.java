package com.mockquestions;

import java.util.Scanner;

public class SwapTwoNumberWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y;

		System.out.println("Enter two nums:");
		Scanner sc = new Scanner(System.in);

		x = sc.nextInt();
		y = sc.nextInt();

		System.out.println("Before Swapping\nx=" + x + "\ny=" + y);

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("After swapping\nx = " + x + "\ny=" + y);

	}

}
