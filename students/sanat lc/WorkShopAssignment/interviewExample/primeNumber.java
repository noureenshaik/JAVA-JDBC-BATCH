package com.interviewExample;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp, num;
		boolean isPrime = true;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		num = sc.nextInt();

		temp = num % 2;
		if (temp == 0) {
			isPrime = false;

		}
		if (isPrime)
			System.out.println(num + " prime Number");
		else
			System.out.println(num + " Not Prime Number");

	}
}
