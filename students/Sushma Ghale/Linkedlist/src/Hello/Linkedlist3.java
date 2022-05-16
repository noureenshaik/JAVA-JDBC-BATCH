package Hello;

import java.util.LinkedList;

public class Linkedlist3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> languages = new LinkedList<String>();

		// add elements in the linked list
		languages.add("Python");
		languages.add("Java");
		languages.add("JavaScript");
		languages.add("c++");
		System.out.println("LinkedList:" + languages);

		// change elements at index 3
		languages.set(3, "c sharp");
		languages.set(1, "Azure Databricks");
		System.out.println("Updated Linkedlist:" + languages);
	}

}
