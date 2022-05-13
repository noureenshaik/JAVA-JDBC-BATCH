package Hello;

import java.util.*;

public class Linkedlist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create linkedlist
		LinkedList<String> animals = new LinkedList<String>();

//add() method without using the index parameter
		animals.add("Dog");// index0
		animals.add("Cat");// index1
		animals.add("Cow");// index2
		System.out.println("LinkedList:" + animals);

		// add()method with the index parameter
		animals.add(1, "Horse");// wants to add animal horse in the index 1
		animals.add(2, "peacock");// wants to add animal peacock in the index 2
		System.out.println("Updated Linkedlist:" + animals);


	}

}
