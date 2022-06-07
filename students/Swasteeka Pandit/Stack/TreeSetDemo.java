package com.stack;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet <Integer> evenNumbers = new TreeSet<>();
		evenNumbers.add(2);
		evenNumbers.add(4);
		evenNumbers.add(6);
		System.out.println("TreeSet: "+evenNumbers);
		TreeSet <Integer> numbers = new TreeSet<>();
		numbers.add(1);
		System.out.println("TreeSet: "+numbers);
		
		TreeSet <String> set = new TreeSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		set.add("F");
		System.out.println("Initial Set: "+set);
		
		System.out.println("Reverse Set: "+set.descendingSet());
		
		System.out.println("Head Set: "+set.headSet("E", false));
		
		System.out.println("Subset: "+set.subSet("A", false, "G", true));
		
		System.out.println("Tail Set: "+set.tailSet("D", true));
	}
	
	
	
	

}