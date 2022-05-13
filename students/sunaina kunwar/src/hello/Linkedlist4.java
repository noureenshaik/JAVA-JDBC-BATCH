package hello;
import java.util.*;
public class Linkedlist4 {
public static void main (String[] args) {
	
	LinkedList<String> languages = new LinkedList<>();
	
	languages.add("Java");
	languages.add("Python");
	languages.add("JavaScript");
	languages.add("Kotlin");
	

	

	System.out.println("LinkedList: " + languages);
	
	String str = languages.remove(1);
	
	System.out.println("Removed elements: " + str);
	
	
	
	System.out.println("Updated LinkedList: " + languages);
	
	
	
}
}
