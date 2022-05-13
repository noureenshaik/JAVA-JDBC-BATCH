package usedinterfacejava;

import java.util.*;

public class SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating a list of fruits
		List<String> list1 = new ArrayList<String>();
		list1.add("Mango");
		list1.add("Apple");
		list1.add("Grapes");
		list1.add("Banana");
		// sorting the list
		Collections.sort(list1);
		System.out.println(list1);

		// traversing listh through the for-each loop
		for (String fruit : list1)
			;

		System.out.println(list1);

		System.out.println("Sorting numbers....");
		// creating a list of numbers
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(21);
		list2.add(11);
		list2.add(51);
		list2.add(1);
		// sorting the list
		Collections.sort(list2);
		System.out.println(list2);

		// traversing listh through the for-each loop
		for (Integer number : list2)
			System.out.println(number);

	}

}
