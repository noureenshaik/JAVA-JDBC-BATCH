import java.util.LinkedList;

public class LinkedListAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create LinkedList
		LinkedList<String> animals = new LinkedList<String>();

		// add() method without the index parameter
		animals.add("Dog");//index 0
		animals.add("Cat");//index 1
		animals.add("Cow");//index 2
		System.out.println("LinkedList:" + animals);

		// add()method with the index parameter
		animals.add(1, "horse");// wants to add animal horse in the index 1

		animals.add(2, "peacock");// wants to add animal peacock in the index 2
		System.out.println("Updated LinkedList:" + animals);

	}

}
