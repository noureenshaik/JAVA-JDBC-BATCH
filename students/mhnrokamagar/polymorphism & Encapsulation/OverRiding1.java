package com.polymorphism;

class Language {
	public void displayInfo() {
		System.out.println("Common English Language");
	}
}
class Java extends Language {
	
	public void displayInfo() {
		System.out.println("Java Programming Language");
	}
}

public class OverRiding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an object of java class
		Java j1=new Java();
		j1.displayInfo();
		
		//create an object of Language class
		Language l1=new Language();
		l1.displayInfo();

	}

}
