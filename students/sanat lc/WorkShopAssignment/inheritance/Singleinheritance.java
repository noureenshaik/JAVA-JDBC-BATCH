package com.inheritance;

class one {
	public void print_greek() {
		System.out.println("Greeks");
	}
}

class two extends one {
	public void print_for() {
		System.out.println("For");
	}
}


class three extends two{
	public void print_toit()
	{
		System.out.println("Toit");
	}
}

public class Singleinheritance {

	public static void main(String[] args) {
		three tw = new three();
		tw.print_greek();
		tw.print_for();
		tw.print_toit();

	}
}
