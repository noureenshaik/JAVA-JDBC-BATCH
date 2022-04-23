package com.noureenclass;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number");
		int num2 = sc.nextInt();
		System.out.println("Enter the third number");
		int num3 = sc.nextInt();
		if(num1>num2) {
			System.out.println("The largest number is:"+num1);
		}
		else if(num2>num3){
			System.out.println("The largest number is:"+num2);
		}
		else {
			System.out.println("The largest number is:"+num3);
		}
	}

}
