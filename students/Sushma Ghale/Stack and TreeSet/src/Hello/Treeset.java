package Hello;

import java.util.*;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(6);
		System.out.println("Treeset:" + numbers);
//calling iterator()method

		Iterator<Integer> iterate = numbers.iterator();
		System.out.println("TreeSet using Iterator:");

//Accessing elements
		while (iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(", ");
		}
	}
}
//hasnext()[2,5,6]
//hasprevious()[2,5,6]--> 2 <--5--> has previous()