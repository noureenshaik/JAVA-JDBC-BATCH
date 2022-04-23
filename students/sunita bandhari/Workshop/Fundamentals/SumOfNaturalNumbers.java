package com.noureenclass.day2;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		int sum = 0;
		int n = 1000;
		for(int i =1; i<=n; i++) {
			sum+=i;
		}
		System.out.println("Sum = "+sum);
	}

}
