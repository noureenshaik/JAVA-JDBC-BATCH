package com.polymorphism;

class Pattern {

	public void display() {
		for (int i = 0; i < 10; i++) {
			System.out.print("*");
		}
	}

	public void display(char symbol) {
		for (int i = 0; i < 10; i++) {
			System.out.print(symbol);
		}
	}

}

class PolyUsingMO {
	public static void main(String[] args) {
		Pattern d1 = new Pattern();
		d1.display();
		System.out.println("\n");

		d1.display('#');
	}

}
