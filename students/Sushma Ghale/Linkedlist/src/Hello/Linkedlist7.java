package Hello;

import java.util.LinkedList;

public class Linkedlist7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a linked list
		LinkedList<String> animals = new LinkedList<>();

		animals.add("Cow");
		animals.add("Cat");
		animals.add("Dog");
		System.out.println("Linkedlist:" + animals);

		// Using forEach loop
		System.out.println("Accessing linked list elements:");
		for (String animal : animals) {// for animal in animals:
			// for i in fruits:
			System.out.print(animal); // s.o.p(i)
			System.out.print(",");
		}
	}

}
