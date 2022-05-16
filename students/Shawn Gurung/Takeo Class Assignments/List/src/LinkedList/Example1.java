package LinkedList;
import java.util.*;
public class Example1 {
	  public static void main(String[] args){
	    // create linkedlist
	    LinkedList<String> animals = new LinkedList<String>();

	    // add() method without the index parameter
	    animals.add("Dog");//index 0
	    animals.add("Cat");//index 1
	    animals.add("Cow");//index 2
	    System.out.println("LinkedList: " + animals);

	    // add() method with the index parameter
	    animals.add(1, "Horse");// wants to add animal horse in the index 1
	    animals.add(2,"peacock");//wants to add animal peacock in the index 2
	    System.out.println("Updated LinkedList: " + animals);
	    String str = animals.get(1);
	    System.out.print("Element at index 1: " + str);
	  }
	}
