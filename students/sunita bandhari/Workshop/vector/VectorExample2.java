package com.vector;

import java.util.Vector;

public class VectorExample2 {

	public static void main(String[] args) {
		
		Vector <String> vec = new Vector <>(4);
		vec.add("Tiger");
		vec.add("Lion");
		vec.add("Dog");
		vec.add("Elephant");
		//check size and capacity
		System.out.println("Size is: " +vec.size());
		System.out.println("Default Capacity is: " +vec.capacity());
		
		System.out.println("Vector element is: " +vec);
		
		vec.addElement("Rat");
		vec.add("Cat");
		vec.add("Deer");
		vec.addElement("Rat");
		vec.add("Cat");
		vec.add("Deer");
		vec.addElement("Rat");
		vec.add("Cat");
		vec.add("Deer");
		
		System.out.println("Size after addition is: " +vec.size());
		System.out.println("Default Capacity after addition is: " +vec.capacity());
		
		System.out.println("Vector element after addition is: " +vec);
		
		if(vec.contains("Tiger")) {
			System.out.println("Tiger is present at the index "+vec.indexOf("Tiger"));
		}
		else {
			System.out.println("Tiger is not present at the index");
		}
		
		System.out.println("The first element in vector is: "+vec.firstElement());
		System.out.println("The last element in vector is: "+vec.lastElement());
	}

}
