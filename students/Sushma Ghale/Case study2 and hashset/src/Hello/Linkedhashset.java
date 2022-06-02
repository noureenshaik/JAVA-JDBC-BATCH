package Hello;

import java.util.*;

public class Linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating an empty LinekdhashSet of string type
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();

		// Adding elements to the above Set
		// by invoking the add() method
		lhs.add("Java");
		lhs.add("T");
		lhs.add("Point");
		lhs.add("Good");
		lhs.add("Website");

		// displaying all the elements on the console
		System.out.println("The hash set is:" + lhs);
		// Removing an element from the above linked Set
		// since the element "Good" is present, therefore, the method remove()
		// returns true
		System.out.println(lhs.remove("Good"));

		// After removing the element
		System.out.println("After removing the element, the hash set is: " + lhs);
		// since the element "For" is not present, therefore, the method remove()
		// returns false
		System.out.println(lhs.remove("For"));
	}

}
