package exceptiondemo;

import java.util.Scanner;

public class HandlingInCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a and b for a/b: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			int data = a/b;
			System.out.println(a + "/" + b + " = "+ data);
		}catch(ArithmeticException e) {
			e.printStackTrace();
			//System.out.println(e);
			System.out.print(a + "/" + (b+2) + " = ");
			System.out.println(a/(b+2));
		}
		
		System.out.println("After try catch block");
	}
}
