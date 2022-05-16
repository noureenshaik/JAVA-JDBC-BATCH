package Hello;

import java.util.*;

public class vectorexample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an empty Vector
		Vector<Integer> in = new Vector<>();
		// Add elements in the vector
		in.add(100);
		in.add(200);
		in.add(300);
		in.add(200);
		in.add(400);
		in.add(500);
		in.add(600);
		in.add(700);
		// Display the vector elements
		System.out.println("Values in vector: " + in);

		System.out.println("Remove first occurence of element 200: " + in.remove((Integer) 200));

		System.out.println("Values in vector: " + in);

		System.out.println("Remove element at index 4: " + in.remove(4));

		System.out.println("New Value list in vector: " + in);

		in.removeElementAt(5);
		// System.out.println("Remove element at index 5: " +in.remove(5));

		System.out.println("Vector element after removal: " + in);

		System.out.println("Hash code of this vector = " + in.hashCode());

		System.out.println("Element at index 1 is = " + in.get(1));
	}

}
