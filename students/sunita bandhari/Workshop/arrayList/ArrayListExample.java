package com.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Ravi");
		al.add("Ajay");
		al.add("Ravi");
		al.add("Vijay");
		al.add("Sanjay");
		System.out.println(al);
		ListIterator it = al.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("********************");
		ListIterator <String> itr = al.listIterator(al.size());
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		al.add(1, "Suraj");
		System.out.println(al);
		
		System.out.println("Traversing list through forEAch() method");
		
		al.forEach(a->System.out.println(a));
		
		System.out.println("Traversing list through forEAchRemaining() method");
		
		Iterator<String> itr1 = al.iterator();
		itr1.forEachRemaining(a->System.out.println(a));
	}

}
