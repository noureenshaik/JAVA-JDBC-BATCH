package LinkedList;
import java.util.LinkedList;
public class Example3 {
	 public static void main(String[] args) {
	    LinkedList<String> languages = new LinkedList<String>();

	    // add elements in the linked list
	    languages.add("Java");// index 0
	    languages.add("Python");// index 1
	    languages.add("JavaScript");//index 2
	    languages.add("c++");//index 3
	    System.out.println("LinkedList: " + languages);

	    // change elements at index 3
	    languages.set(3, "c sharp");
	    languages.set(1, "Azure Databricks");
	    System.out.println("Updated LinkedList: " + languages);
	  }
	}

