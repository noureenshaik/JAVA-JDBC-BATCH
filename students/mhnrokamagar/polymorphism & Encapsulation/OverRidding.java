package com.polymorphism;

//Java Program to demonstrate the real scenario of java method overriging 
//where three classes are overriding the method of a parent class
//crating a parent class.

class Bank {
	int getRateOfInterest() {return 0;}
}
//creating child classes
class BOFA extends Bank {
	int getRateOfInterest() {return 8;}
}
class CHASE extends Bank {
	int getRateOfInterest() {return 7;}
}
class TD extends Bank {
	int getRateOfInterest() {return 9;}
}
// Test class to create objects and call the methods

public class OverRidding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BOFA b=new BOFA();
		CHASE c=new CHASE();
		TD t=new TD();
		System.out.println("BOFA Rate Of Interest: "+b.getRateOfInterest());
		System.out.println("CHASE Rate Of Interest: "+c.getRateOfInterest());
		System.out.println("TD Rate Of Interest: "+t.getRateOfInterest());

	}

}
