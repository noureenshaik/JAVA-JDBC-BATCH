package com.workshop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Input the first number:");
		int num1=input.nextInt();
		System.out.print("Input the second number:");
		int num2=input.nextInt();
		int sum=num1+num2;
		System.out.println();
		System.out.println("sum:"+sum);
		
		
	}

}
