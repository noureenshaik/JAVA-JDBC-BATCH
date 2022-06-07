package hello;
import java.util.*;
public class Linkedlist5 {
public static void main (String[] args) {
	
	Queue<String> languages = new LinkedList<>();
	
	languages.add("Java");
	languages.add("Python");
	languages.add("C");
	System.out.println("LinkedList: " + languages);

	String str1 = languages.peek();
	
	System.out.println("Accessed elements: " + str1);
	
	
	String str2 = languages.poll();
	System.out.println("Removed elements: " + str2);
	System.out.println("Linked List: " + str2);
	
	
	System.out.println("Updated LinkedList: " + languages);
	
	
	
}
}
