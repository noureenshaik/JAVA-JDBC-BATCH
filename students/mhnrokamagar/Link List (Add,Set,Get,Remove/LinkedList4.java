package LinkedListAddSetGetRemove;

import java.util.LinkedList;

public class LinkedList4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				LinkedList<String> animals=new LinkedList<>();
				//add elements in the linked list
				animals.add("Cow"); //index 0
				animals.add("Cat"); //index 1
				animals.add("Horse"); //index 2
				animals.add("Dog"); //index 3
				
				System.out.println("LinkedList:"+ animals);
				
				//using forEach loops
				System.out.println("Accessing linked list elements:");
				for(String animal : animals) { // for animal in animals
					// for 1 in fruits
					
					System.out.print(animal); //s.o.p(i)
					System.out.print(", ");

				}

	}

}
