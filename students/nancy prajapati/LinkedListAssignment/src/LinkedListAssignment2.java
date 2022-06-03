import java.util.LinkedList;

public class LinkedListAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> languages = new LinkedList<>();

		// add() method without index parameter
		languages.add("Python");// index 0
		languages.add("Java");// index 1
		languages.add("javaScript");// index 2

		System.out.println("LinkedList:" + languages);

//get the element from the linked List
		String str = languages.get(1);
		System.out.println("Elements at index 1:" + str);

	}

}
