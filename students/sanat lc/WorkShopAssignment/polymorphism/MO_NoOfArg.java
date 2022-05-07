package com.polymorphism;

class Adder {
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}
}

class MO_NoOfArg {
	public static void main(String[] args) {
		System.out.println(Adder.add(11, 12));
		System.out.println(Adder.add(11, 12, 13));
	}

}
