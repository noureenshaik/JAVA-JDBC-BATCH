package com.vector;

import java.util.Vector;

public class VectorExample1 {

	public static void main(String[] args) {
		Vector <String> vec = new Vector<>();
		vec.add("Tiger");
		vec.add("Lion");
		vec.add("Dog");
		vec.add("Elephant");
		vec.add("Cat");
		vec.addElement("Rat");
		vec.addElement("Rat");
		vec.addElement("Deer");
		
		System.out.println(vec);
	}

}
