package com.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> animals= new LinkedList <String> ();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Cow");
		System.out.println("Linked List: "+animals);	
		
		animals.add(1, "Horse");
		animals.add(2, "Peacock");
		System.out.println("Updated Linked List: "+animals);
		String str = animals.get(1);
		System.out.println("Element ate index 1 is : "+str);
	}

}
