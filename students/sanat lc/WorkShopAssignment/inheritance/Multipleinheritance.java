package com.inheritance;

interface one1 {
	public void print_greek();

}

interface two1 {
	public void print_for();
}

interface three1 extends one1, two1 {

	public void print_toit();

}

class child implements three1 {
	public void print_greek() {
		System.out.println("Greeeeek");
	}

	public void print_for() {
		System.out.println("For");
	}

	public void print_toit(){
		System.out.println("Toit");
	}
}

public class Multipleinheritance {

	public static void main(String[] args) {
		child c = new child();
		c.print_for();
		c.print_greek();
		c.print_toit();

	}
}
