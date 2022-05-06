package com.polymorphism;

class adder1 {
	static int add1(int a, int b) {
		return a + b;
	}

	static double add1(double a, double b) {
		return a + b;
	}

}

class MO_changingdatatype {
	public static void main(String[] args) {
		System.out.println(adder1.add1(11, 12));
		System.out.println(adder1.add1(12.4, 13.5));
	}

}
