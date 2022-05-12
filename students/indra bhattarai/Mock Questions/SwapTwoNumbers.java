package com.mockquestions;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y, temp;
		System.out.println("Enter the two numbers:");

		Scanner sc = new Scanner(System.in);

		x = sc.nextInt();
		y = sc.nextInt();

		System.out.println("Display the num before swapping" + x + y);
		temp = x;
		x = y;
		y = temp;

		System.out.println("After swapping" + x + y);

	}

}
