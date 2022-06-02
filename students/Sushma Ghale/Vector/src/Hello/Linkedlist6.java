package Hello;

import java.util.Deque;
import java.util.LinkedList;

public class Linkedlist6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> animals = new LinkedList<>();

		// add element at the beginning
		animals.add("Cow");// index 0
		System.out.println("LinkedList:" + animals);

		animals.addFirst("Dog");// first element with index 0 [Dog, Cow]
		System.out.println("LinkedList after addFirst():" + animals);

		// add elements at the end
		animals.addLast("Zebra");// last element with index 2 should be zebra [dog,cow,zebra]
		System.out.println("Linkedlsit after addLast():" + animals);

		// remove the first element
		animals.removeFirst();// which remove first element from the linkedlist[dog}
		System.out.println("Linkedlist after removeFirst():" + animals);

		// remove the last element
		animals.removeLast();// [cow, zebra] remove the last element zebra
		System.out.println("LinkedList after removeLast():" + animals);
	}

}
