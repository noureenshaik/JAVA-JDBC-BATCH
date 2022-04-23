package com.noureenclass;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.println("AAAAHHHHAAAA!!!It is an even number");
		}
		else {
			System.out.println("It is an odd number");
		}

	}

}
