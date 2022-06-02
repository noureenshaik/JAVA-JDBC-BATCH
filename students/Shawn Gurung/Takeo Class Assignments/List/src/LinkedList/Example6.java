package LinkedList;
import java.util.LinkedList;
import java.util.Deque;
public class Example6 {
	  public static void main(String[] args){
	    Deque<String> animals = new LinkedList<>();

	    // add element at the beginning
	    animals.add("Cow");// index 0
	    System.out.println("LinkedList: " + animals);

	    animals.addFirst("Dog");// first element with index 0 [dog,cow]
	    System.out.println("LinkedList after addFirst(): " + animals);

	    // add elements at the end
	    animals.addLast("Zebra");// last element with index 2 should be zebra [dog,cow,zebra]
	    System.out.println("LinkedList after addLast(): " + animals);

	    // remove the first element
	    animals.removeFirst();//which removes first element from the linkedlist[dog]
	    System.out.println("LinkedList after removeFirst(): " + animals);

	    // remove the last element
	    animals.removeLast();//[cow, zebra] removes last element zebra
	    System.out.println("LinkedList after removeLast(): " + animals);
	  }
	}
