package LinkedList;
import java.util.LinkedList;
import java.util.Queue;
public class LinkedListDeomo6 {


		public static void main(String[] args) {
			
			LinkedList<String> al = new LinkedList<>();
			al.add("horse");
			al.add("dog");
			al.add("cat");
			al.add("man");
			al.add("hen");
			System.out.println("linked list: "+al);
			
			//using forEach loop
		
			System.out.println("accessed linked list eleemnts: ");
			for(String als: al) {
				System.out.print(als+" : ");

			}
		

		}

	

}
