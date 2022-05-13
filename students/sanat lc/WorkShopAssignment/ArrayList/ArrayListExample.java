package com.ArrayList;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Mango");
		al.add("Apple");
		al.add("Banana");
		al.add("Blueberry");
		al.add("Kiwi");
		al.add("Rasberry");
// Accessing the element

		System.out.println("Returning element: " + al.get(1));
		System.out.println("Returning Element: " + al.get(3));

		System.out.println("Returning element: " + al.get(2));
		System.out.println("Returning Element: " + al.get(5));

// Changing the elements
		al.set(1, "Cherry");
		al.set(3, "Cherry");
		al.set(2, "Avacado");
		al.set(5, "Strawberry");

		for (String fruit : al)
			System.out.println(fruit);
		
		System.out.println("Nakkali keti Moah");

	}

}
