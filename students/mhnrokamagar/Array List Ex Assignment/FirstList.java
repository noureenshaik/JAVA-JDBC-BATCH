package usedinterfacejava;



import java.util.ArrayList;

public class FirstList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();// creating arraylist
		//Arraylist<Integer> list=new ArrayList<Integer>();
		//ArrayList<Boolean> list=new ArrayList<Boolean>();
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		//traversing list through for-each loop
		for(String fruit:list)
			System.out.println(fruit);
		//printing the arraylist object
		System.out.println(list);

	}

}
