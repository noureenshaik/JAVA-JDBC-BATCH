package LinkedList;
import java.util.LinkedList;
public class Example7 {
	    public static void main(String[] args) {
	        // Creating a linked list
	        LinkedList<String> animals = new LinkedList<>();
	        animals.add("Cow");
	        animals.add("Cat");
	        animals.add("Dog");
	        System.out.println("LinkedList: " + animals);

	        // Using forEach loop
	        System.out.println("Accessing linked list elements:");
	        for(String animal: animals) {// for animal in animals:
	        	// for i in fruits:
	            System.out.print(animal);//s.o.p(i)
	            System.out.print(", ");
	        }
	    }
	}
