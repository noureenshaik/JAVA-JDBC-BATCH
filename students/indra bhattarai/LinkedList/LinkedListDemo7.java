package com.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> animals = new LinkedList<>();
		
		animals.add("Cow");
		animals.add("Cat");
		animals.add("Dog");
		
		System.out.println("LinkedList:"+animals);
		
		// using for each loop
		
		System.out.println("Accessing the linked list elements");
		
		for(String animal:animals) {
			System.out.println(animal);
			
			System.out.println(",");
		}

	}

}
