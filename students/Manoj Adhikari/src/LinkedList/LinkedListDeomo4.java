package LinkedList;
import java.util.LinkedList;
public class LinkedListDeomo4 {


		public static void main(String[] args) {
			
			LinkedList<String> al = new LinkedList<String>();
			al.add("horse");
			al.add("dog");
			al.add("cat");
			System.out.println("linked list: "+al);
			al.add(1,"manoj");
			System.out.println("updated linked list: "+al);
			
			//change elements at index 3
			al.set(3, "deepa");
			System.out.println("Element at index 1: "+al);

			

			
		

		}

	

}
