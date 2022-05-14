package com.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		List <String> list = new LinkedList<>();
		list.add("Java");
		list.add("Python");
		list.add("JavaScript");
		list.add("C++");
		System.out.println("LinkedList: "+list);
		
		list.set(3, "C Sharp");
		list.set(1,  "Azure Databricks");
		list.add(4, "Scala");
		System.out.println("Updated LinkedList is: "+list);
		String str = list.remove(1);
		String str1 = list.remove(2);
		System.out.println("Removed element is: "+str);
		System.out.println("Removed element is: "+str1);
		System.out.println("Final LinkedList is: "+list);
	}

}
