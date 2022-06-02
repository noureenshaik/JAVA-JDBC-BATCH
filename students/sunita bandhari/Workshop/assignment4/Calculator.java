package com.assignment4;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Number1");
		int num1 = sc.nextInt();
		System.out.println("Enter Number2");
		int num2 = sc.nextInt();
		System.out.println("Enter Operation +, - , *, /");
		char op = sc.next().charAt(0);
		switch(op) {
		case '+':
			int sum = num1+num2;
			System.out.println("Sum: "+sum);
			break;
		case '-':
			int sub = num1-num2;
			System.out.println("Subtraction: "+sub);
			break;
		case '*':
			int mul = num1*num2;
			System.out.println("Multiplication: "+mul);
			break;
		case '/':
			int div = num1/num2;
			System.out.println("Division: "+div);
			break;
		default:
			System.out.println("Please enter the valid operation");
		}
	}

}
