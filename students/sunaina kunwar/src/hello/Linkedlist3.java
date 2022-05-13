package hello;
import java.util.*;
public class Linkedlist3 {
public static void main (String[] args) {
	
	LinkedList<String> languages = new LinkedList<>();
	
	languages.add("Java");
	languages.add("Python");
	languages.add("JavaScript");
	languages.add("c++");

	System.out.println("LinkedList: " + languages);
	
	
	languages.set(3, "c sharp");
	languages.set(1, "Azure Databricks");
	
	System.out.println("Updated LinkedList: " + languages);
	
	
	
}
}
