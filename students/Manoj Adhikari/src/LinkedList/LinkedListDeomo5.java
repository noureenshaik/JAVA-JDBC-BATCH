package LinkedList;
import java.util.LinkedList;
import java.util.Queue;
public class LinkedListDeomo5 {


		public static void main(String[] args) {
			
			Queue<String> al = new LinkedList<String>();
			al.add("horse");
			al.add("dog");
			al.add("cat");
			al.add("man");
			al.add("hen");
			System.out.println("linked list: "+al);
		
			//access the element first
			String str1 = al.peek();
			System.out.println("accessed element: "+ str1);
			
			//	access and remove first the element first
			String str2=al.poll();
			System.out.println("RemoveElement element: "+ str2);
			System.out.println("linked list after poll: "+al);
			
			//add element at the end
			al.offer("Swift");
			System.out.println("linked list after offer: "+al);


			

			
		

		}

	

}
