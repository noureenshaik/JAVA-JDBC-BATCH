package Hello;

import java.util.LinkedList;

public class Linkedlist4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> languages = new LinkedList<String>();

		// add elements in the linked list
		languages.add("Python");// index 0
		languages.add("Java");// index 1
		languages.add("JavaScript");// index 2
		languages.add("Kotlin");// index 3

		System.out.println("LinkedList:" + languages);

		// remove elements from index 1
		String str = languages.remove(1);
		System.out.println("Removed Element:" + str);

		System.out.println("Updated Linkedlist:" + languages);
	}

}
