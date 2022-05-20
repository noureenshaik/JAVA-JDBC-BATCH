package Hello;

import java.util.*;

public class Hashset3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();

		set.add("deepa");
		// set = (sunita, ramee, sushma, sushmita, sijan}
		set.add("sunita");
		set.add("ramee");
		set.add("Sushma");

		System.out.println("An initial list of elements:" + set);

		// Removing specific element from HashSet
		set.remove("deepa");

		System.out.println("After invoking remove(object) method: " + set); // created one more has

		HashSet<String> set1 = new HashSet<String>();
		set1.add("susmita");
		set1.add("sijan");// set 1 {susmita, sijan}
		set.addAll(set1);

		System.out.println("Updated List:" + set);

		// Removing all the new elements from HashSet
		set.removeAll(set1);

		System.out.println("After invoking removeAll() method:" + set);

		// Removing elements on the basis of specified condition
		set.removeIf(str -> str.contains("sunita"));//using lambda expression(to reduce the lines of code we do use lambda expression)

		System.out.println("After invoking removeIf() method:" + set); // {ramee, sushma, sushmita,

		// Removing all the elements available in the set

		set.clear();

		System.out.println("After invoking clear() method:" + set);//{}
		{
		}

	}
}
