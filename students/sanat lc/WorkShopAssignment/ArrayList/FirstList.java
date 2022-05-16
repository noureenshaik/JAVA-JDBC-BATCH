package com.ArrayList;

import java.util.ArrayList;

public class FirstList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list= new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		
		for(String fruit:list)
		
			System.out.println(fruit);
			
			System.out.println(list);
		
	}

}
