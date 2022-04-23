package com.assignment2;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input the first number: ");
		int num1 = input.nextInt();
		System.out.println("Input the second number: ");
		int num2 = input.nextInt();
		int sum = num1 + num2;
		int div = num1 / num2;
		System.out.println();
		System.out.println("Sum: " + sum);
		System.out.println("The division of num1 and num2 is: " + div);
		System.out.println("-------------------");

		System.out.println("Input your first name: ");
		String fname = input.next();
		System.out.println("Input your last name: ");
		String lname = input.next();
		System.out.println();
		System.out.println("Hello \n" + fname + " " + lname);
		System.out.println("-------------------");

	}

}
