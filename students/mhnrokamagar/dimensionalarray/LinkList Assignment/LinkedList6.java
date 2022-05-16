package LinkedListAddSetGetRemove;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedList6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<String> animals = new LinkedList<>();

		// add element the beginning
		animals.add("Deer"); // index 0 [dog,Deer]
		System.out.println("LinkedList after addFirst(): " + animals);

		animals.addFirst("Dog"); // first element with index 0 [dog, deer]
		System.out.println("LinkedList after addFirst():" + animals);

		// add elements at he end
		animals.addLast("Zebra"); // last element with index 2 should be zebra [dow,Deer,Cow]
		System.out.println("LinkedList after addLast(): " + animals);

		// remove the first element
		animals.removeFirst(); // remove first element form linkedList [Deer]
		System.out.println("linkedList after removeFirst(): " + animals);

		// remeove the last element
		animals.removeLast(); // [cow, zebra] remve last element [zebra]
		System.out.println("LinkedList after removeLast(): " + animals);

	}

}
