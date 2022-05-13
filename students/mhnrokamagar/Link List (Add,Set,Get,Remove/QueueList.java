package LinkedListAddSetGetRemove;

import java.util.LinkedList;
import java.util.Queue;

public class QueueList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> languages = new LinkedList<>();
		
		//add elements in the linked list
		languages.add("Pythan"); //index 0
		languages.add("Java");  // index 1
		languages.add("JavaScript");  // index 2
		languages.add("C++"); // index 3
		
		
		System.out.println("LinkedList : "+ languages);

	}

}
