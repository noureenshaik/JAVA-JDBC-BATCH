package com.interviewExample;

import java.util.Scanner;

public class swapTwoNumbersWithoutUsingTheThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the two Numbers");
		int x= sc.nextInt();
		int y=sc.nextInt();
		
		System.out.println("Value before Swap: "+x+"\t"+y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("Number after Swap: "+x+"\t"+y);
	}

}
