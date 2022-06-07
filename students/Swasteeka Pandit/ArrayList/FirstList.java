package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FirstList {
	public static void main(String[] args) {
		List<String> ls = new ArrayList<>();
		ls.add("M");
		ls.add("B");
		ls.add("A");
		ls.add("G");
		
		for(String fruits :ls) {
			System.out.println(fruits);
		}
		System.out.println("***************");
		Iterator itr = ls.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("***************");
		System.out.println(ls);
		ls.remove(0);
		System.out.println(ls);
	}

}
