package Hello;

import java.util.*;

public class arraylistexample {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Mango");
		al.add("Apple");
		al.add("Banana");
		al.add("Blueberry");
		al.add("kiwi");
		al.add("Raspberry");
		// accessing the element
		System.out.println("Returning element: " + al.get(1));
		System.out.println("Returning element: " + al.get(3));
		System.out.println("Returning element: " + al.get(2));
		System.out.println("Returning element: " + al.get(5));// it will return the 2nd element, because index starts
																// from 0
		// changing the element
		al.set(1, "Cherry");
		al.set(3, "Grapes");
		al.set(2, "Avocado");
		al.set(5, "Strawberry");
		// Traversing list
		for (String fruit : al)
			;
		System.out.println("fruit");

	}
}
