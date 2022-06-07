package hello;
import java.util.*;
public class Linkedlist7 {
public static void main (String[] args) {
	
	LinkedList<String> animals = new LinkedList<String>();
	
	animals.add("Dog");
	animals.add("Cat");
	animals.add("Cow");
	System.out.println("LinkedList: " + animals);
	
	System.out.println("Accessing LinkedList Elements: ");
	for(String animal: animals) {
		System.out.print(animal);
	}	
}
}
