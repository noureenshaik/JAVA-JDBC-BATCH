package Hello;

import java.util.*;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();// Creating array list
		list.add("orange");// Adding object in array list
		list.add("kiwi");
		list.add("cherry");
		list.add("banana");
//Traversing list through Iterator
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
