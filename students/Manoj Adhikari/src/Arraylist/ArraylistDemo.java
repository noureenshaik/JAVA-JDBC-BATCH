package Arraylist;

import java.util.ArrayList;

public class ArraylistDemo {
	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		a1.add(100);
		System.out.println(a1);
		a1.add(60);
		System.out.println(a1);
		a1.add(1,"manoj");
		System.out.println(a1);
		
		Object obj = a1.get(1);
		String name = (String)obj;
	System.out.println(name);
	
	for(Object obj1:a1) {
		 System.out.println(obj1);

		
	}

	}

}
