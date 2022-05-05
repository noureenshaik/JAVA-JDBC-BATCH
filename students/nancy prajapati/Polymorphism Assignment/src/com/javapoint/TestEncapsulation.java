package com.javapoint;

public class TestEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating instance of Account class
		Account acc = new Account();
		// setting values through setter methods
		acc.setAcc_no(7560504000L);
		acc.setName("Sonoo Jaiswal");
		acc.setEmail("sonoojaiswal@javapoint.com");
		// getting values through getter methods
		System.out.println(acc.getAcc_no() + " " + acc.getName() + " " +acc.getAmount());

	}

	
	}


