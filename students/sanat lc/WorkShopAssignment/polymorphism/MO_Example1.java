package com.polymorphism;

class Bank {
	int getRateOffinterest() {
		return 0;
	}
}

class SBI extends Bank {
	int getRateOfInterest() {
		return 8;
	}
}

class ICICI extends Bank {
	int getRateOfInterest() {
		return 7;
	}
}

class AXIS extends Bank {
	int getRateOfInterest() {
		return 9;
	}
}

class MO_Example1 {
	public static void main(String args[]) {
		SBI s = new SBI();
		ICICI i = new ICICI();
		AXIS a = new AXIS();

		System.out.println("SBI Rate of Interest: " + s.getRateOffinterest());
		System.out.println("ICICI Rate of Interest : " + i.getRateOffinterest());
		System.out.println("AXIS Rate of Interest :" + a.getRateOffinterest());

	}
}