import java.util.LinkedList;

public class LinkedListAssignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> languages = new LinkedList<>();

		// add elements in the linked list
		languages.add("Java");
		languages.add("Python");
		languages.add("JavaScript");
		languages.add("Kotlin");

		System.out.println("LinkedList:" + languages);

		// remove elements from index 1
		String str = languages.remove(1);

		System.out.println("removed Element:" + str);
		System.out.println("Updated LinkedList:" + languages);

	}

}
