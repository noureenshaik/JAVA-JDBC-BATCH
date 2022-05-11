package com.javapoint;

abstract class Bank {
	public abstract int getRateOfInterest();

}

class ICICI extends Bank {

	@Override
	public int getRateOfInterest() {
		// TODO Auto-generated method stub
		return 7;
	}

}

class SBI extends Bank {

	@Override
	public int getRateOfInterest() {
		// TODO Auto-generated method stub
		return 8;
	}

}

class AXIS extends Bank {

	@Override
	public int getRateOfInterest() {
		// TODO Auto-generated method stub
		return 9;
	}

}

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICICI i = new ICICI();
		SBI s = new SBI();
		AXIS a = new AXIS();
		System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
		System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
		System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());
	}

}
