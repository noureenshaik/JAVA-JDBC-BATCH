package Hello;

import java.util.*;

public class Hashset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating HashSet and adding elements
		HashSet<String> set = new HashSet();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		Iterator<String> i = set.iterator();
		while (i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
