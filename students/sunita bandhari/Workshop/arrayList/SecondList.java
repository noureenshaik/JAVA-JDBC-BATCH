package com.arrayList;

import java.util.*;

public class SecondList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Blueberry");
		list.add("kiwi");
		list.add("Raspberry");
		
		System.out.println(list);
		System.out.println();
		//accessing the element
		System.out.println("The returning element: "+list.get(0));
		System.out.println("The returning element: "+list.get(2));
		System.out.println("The returning element: "+list.get(4));
		
		//changing the element
		list.set(0, null);
		list.set(1, "Cherry");
		list.set(5, "Avocado");
		
		System.out.println(list);
		System.out.println("********************");
		for(String fruit :list) {
			System.out.println(fruit);
		}
		
	}

}
