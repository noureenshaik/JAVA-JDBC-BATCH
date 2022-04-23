package com.noureenclass;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if(num<0) {
			System.out.println("It is a negative number");
		}
		else if (num>0) {
			System.out.println("It is a positive number");
		}
		else {
			System.out.println("It is a zero");
		}

	}

}
