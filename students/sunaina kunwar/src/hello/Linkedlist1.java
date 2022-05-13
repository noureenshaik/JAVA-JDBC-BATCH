package hello;
import java.util.*;
public class Linkedlist1 {
public static void main (String[] args) {
	
	LinkedList<String> animals = new LinkedList<String>();
	
	animals.add("Dog");
	animals.add("Cat");
	animals.add("Cow");
	System.out.println("LinkedList: " + animals);
	
	
	animals.add(1, "Horse");
	animals.add(2, "peacock");
	System.out.println("Updated LinkedList: " + animals);
	String str = animals.get(1);
	System.out.print("Element at index 1: " + str);
	
	
}
}
