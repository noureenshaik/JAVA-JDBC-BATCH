package com.linkedlist;

import java.util.LinkedList;

public class LinkedListdemo33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> languages = new LinkedList<>();
		
		// adding the element in the linkedlist
		
		languages.add("Java");
		languages.add("python");
		languages.add("JavaScript");
		languages.add("kotlin");
		languages.add("Html");
		languages.add("Ccs");
		languages.add("Angular");
		languages.add("React");
		
		System.out.println("Linkedlist:"+languages);
		
		 languages.remove(1);
		System.out.println("Removed LinkedList:"+languages);
		
	}

}
