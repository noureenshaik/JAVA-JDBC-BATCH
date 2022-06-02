package com.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo1 {

	public class LinkedListDemo4 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> animals = new LinkedList<String>();

		// add() method without index parameter

		animals.add("Dog");
		animals.add("Cat");
		animals.add("Cow");
		animals.add("Elephant");
		animals.add("tiger");
		

		System.out.println("LinkedList:" + animals);

		// add () method with the index parameter

		animals.add(1, "Horse");
		animals.add(2, "Peacock");

		System.out.println("Updated linkedlist:" + animals);
		
		
		animals.set(0,"Rammy");
		System.out.println("Element at index 1:"+animals);
		

	}

}
