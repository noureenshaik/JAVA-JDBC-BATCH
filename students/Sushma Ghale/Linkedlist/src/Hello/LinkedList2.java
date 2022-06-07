package Hello;

import java.util.*;

public class LinkedList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> languages = new LinkedList<String>();

		// add elements in the linked list
		languages.add("Python");
		languages.add("Java");
		languages.add("JavaScript");
		System.out.println("LinkedList:" + languages);

		// get the element from the linked list
		String str = languages.get(1);
		System.out.print("Element at index 1:" + str);
	}

}
