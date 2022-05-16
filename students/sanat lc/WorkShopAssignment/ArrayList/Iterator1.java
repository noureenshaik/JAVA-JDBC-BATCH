package com.ArrayList;

import java.util.*;

public class Iterator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();
		list.add("orange");
		list.add("Kiwi");
		list.add("Cherry");
		list.add("banana");
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
	}
}
