package usedinterfacejava;

import java.util.ArrayList;

public class ArrayListUsingSetMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Mango");
		al.add("Apple");
		al.add("Banana");
		al.add("Grapes");
		al.add("kiwi");
		al.add("Rasberry");

		// accessing the element
		System.out.println("Returning element: " + al.get(1)); // it will return the 2nd element,
		// because index changing the element
		System.out.println("Returning element: " + al.get(3));
		System.out.println("Returning element: " + al.get(2));
		System.out.println("Returning element: " + al.get(5));

		// changing the element
		al.set(1, "Cherry");
		al.set(3, "Grapes");
		al.set(2, "Avacado");
		al.set(5, "Strawberry");

		// for traversing list
		for (String fruit : al)
			System.out.println(fruit);

	}

}
