package Hello;

import java.util.*;
import java.util.Vector;

public class vectorexample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vec = new Vector<String>();
//Adding elements using add() method of List
		vec.addElement("Tiger");
		vec.addElement("Lion");
		vec.addElement("Dog");
		vec.addElement("Elephant");
//Adding elements using addElement() method of Vector
		vec.addElement("Rat");
		vec.addElement("Cat");
		vec.addElement("Deer");

		System.out.println("Elements are: " + vec);

	}

}
