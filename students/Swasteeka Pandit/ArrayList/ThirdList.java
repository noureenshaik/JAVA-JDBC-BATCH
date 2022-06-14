package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ThirdList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Kiwi");
		list.add("Cherry");
		list.add("Mango");
		Collections.sort(list);
		System.out.println(list);
		System.out.println();
		for (String fruit : list)
			System.out.println(fruit);

		System.out.println("******************");
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(6);
		list1.add(10);
		list1.add(23);
		list1.add(20);
		list1.add(34);
		list1.add(40);
		list1.add(5);
		Collections.sort(list1);
		System.out.println(list1);
		System.out.println();
		Iterator itr = list1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
