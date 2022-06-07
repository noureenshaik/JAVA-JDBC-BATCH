package Hello;

import java.util.*;

public class Treeset2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set = new TreeSet<String>();
		set.add("A");// head
		set.add("B");// head
		set.add("C"); // middle
		set.add("D");// middle
		set.add("E"); // tail
		set.add("F");
		set.add("G");// tail
		System.out.println("Initial Set:" + set);
		System.out.println("Reverse Set:" + set.descendingSet());
		System.out.println("Head Set:" + set.headSet("E", false));

		System.out.println("SubSet:" + set.subSet("A", false, "G", true));
		System.out.println("TailSet:" + set.tailSet("D", true));
	}

}
