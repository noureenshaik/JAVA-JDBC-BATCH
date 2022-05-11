package com.interviewExample;

import java.util.Scanner;

public class swapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st value");
		int x= sc.nextInt();
		System.out.println("Enter the 2nd value");
		int y=sc.nextInt();
		
		System.out.println("Before Swap: "+ x+" \t" + y);
		int temp;
		
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("After Swap: "+ x+" \t"+ y);
	}

}
