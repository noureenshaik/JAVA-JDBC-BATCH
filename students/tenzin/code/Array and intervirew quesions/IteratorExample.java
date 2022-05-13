import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String [] args) {
		ArrayList<String> addName=new ArrayList<>();
		addName.add("tenzin");
		addName.add("sonam");
		addName.add("dorjee");
		addName.add("kelsang");
		System.out.println(addName);
		System.out.println("changing ="+addName.get(1));
		addName.set(1, "rani");
		Iterator it=addName.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
