import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Mango");
		al.add("Apple");
		al.add("Banana");
		al.add("Grapes");
		al.add("Avocado");
		al.add("Strawberry");

		System.out.println("Returning element:" + al.get(1));
		System.out.println("Returning element:" + al.get(3));
		System.out.println("Returning element:" + al.get(2));
		System.out.println("Returning element:" + al.get(5));// it will return 2nd element, because index starts from 0
		// changing the element

		al.set(1, "Cherry");
		al.set(3, "Blueberry");
		al.set(2, "Kiwi");
		al.set(5, "Watermelon");
		// traversing list
		for (String fruit : al)
			System.out.println(fruit);

	}

}
