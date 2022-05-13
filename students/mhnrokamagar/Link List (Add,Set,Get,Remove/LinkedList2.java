package LinkedListAddSetGetRemove;

import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> languages=new LinkedList<>();
		//add elements in the linked list
		languages.add("Pythan"); //index 0
		languages.add("Java");  // index 1
		languages.add("JavaScript");  // index 2
		languages.add("C++"); // index 3
		System.out.println("LinkedList : "+ languages);
		
		//get the element from the linked list
		String str= languages.get(1);
		System.out.println("Elements at index 1: " +str);
		
		
		// change elements at index 3
		languages.set(3, "Kotlin");
		languages.set(1, "HTML");
		System.out.println("updated LinkedList: " + languages);

	}

}
