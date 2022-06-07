package LinkedList;
import java.util.LinkedList;
public class LinkedListDeomo2 {


		public static void main(String[] args) {
			
			LinkedList<String> al = new LinkedList<String>();
			al.add("horse");
			al.add("dog");
			al.add("cat");
			al.add("man");
			al.add("hen");
			System.out.println("linked list: "+al);
			al.add(1,"manoj");
			System.out.println("updated linked list: "+al);
			
			//remove elements at index 3
			String remove=al.remove(3);
			System.out.println("RemoveElement at index 3: "+remove);
			System.out.println("linked list: "+al);

			

			
		

		}

	

}
