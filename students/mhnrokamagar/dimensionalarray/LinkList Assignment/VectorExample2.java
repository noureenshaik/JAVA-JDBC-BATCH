package LinkedListAddSetGetRemove;

import java.util.Vector;

public class VectorExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create an empty vector
		Vector<Integer> in = new Vector<>();
		// add elements in the vector
		in.add(100);
		in.add(200);
		in.add(300);
		in.add(200);
		in.add(400);
		in.add(500);
		in.add(600);
		in.add(700);
		
		// Display the vector elements
		System.out.println("Values in vector:"+ in);
		
		System.out.println("Remove first occourence of element 200: "+ in.remove((Integer)200));
		
		System.out.println("Values in vector:"+in);
		
		System.out.println("Remove element at index 4:"+in.remove(4));
		
		System.out.println("New Value in vector:"+in);
		
		in.removeElementAt(5);
		
		System.out.println("Vector Elements after removal:"+in);
		
		System.out.println("Hash code of this vector:"+in.hashCode());
		
		System.out.println("Element at index 1 is = "+in.get(1));






	}

}
