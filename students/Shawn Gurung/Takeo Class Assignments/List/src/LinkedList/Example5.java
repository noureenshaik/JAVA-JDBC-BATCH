package LinkedList;
import java.util.LinkedList;
import java.util.Queue;
public class Example5 {
	  public static void main(String[] args) {
	    Queue<String> languages = new LinkedList<String>();

	    // add elements
	    languages.add("Python");
	    languages.add("Java");
	    languages.add("C");
	    System.out.println("LinkedList: " + languages);

	    // access the first element
	    //peek() - Returns the head of the queue. ..
	    String str1 = languages.peek();
	    System.out.println("Accessed Element: " + str1);

	    // access and remove the first element
	    //poll() - Returns and removes the head of the queue.
	    String str2 = languages.poll();
	    System.out.println("Removed Element: " + str2);
	    System.out.println("LinkedList after poll(): " + languages);

	    // add element at the end
	    //offer() - Inserts the specified element into the queue.
	    languages.offer("Angular");
	    System.out.println("LinkedList after offer(): " + languages);
	  }
	}

