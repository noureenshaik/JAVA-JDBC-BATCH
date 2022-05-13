package Hello;

import java.util.*; //import java.util.Arraylist;

public class Firstlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();// creating ArrayList
//ArrayList<Integer> list=new ArrayList<Integer>();
//ArrayList<Boolean> list=new ArrayList<Boolean>();	
		list.add("Mango");// Adding object in arraylist
		list.add("Apple");
		list.add("Banana");
//Traversing list through for-each loop
		for (String fruit : list)
			System.out.println(fruit);
		// Printing the array list object
		System.out.println(list);
	}

}
