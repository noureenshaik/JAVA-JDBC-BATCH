package com.vector;

import java.util.Vector;

public class VectorExample3 {

	public static void main(String[] args) {
		Vector <Integer> vc = new Vector <>();
		vc.add(100);
		vc.add(200);
		vc.add(300);
		vc.add(200);
		vc.add(400);
		vc.add(500);
		vc.add(600);
		vc.add(700);
		
		System.out.println("Values in vector: "+vc);
		System.out.println("Remove the first occurance of element 200: "+vc.remove((Integer)200));
		System.out.println("Values in vector: "+vc);
		System.out.println("Remove element at index 4: "+vc.remove(4));
		System.out.println("New value list in vector: "+vc);
		vc.removeElementAt(5);
		System.out.println("Vector after element removal: "+vc);
		System.out.println("HashCode of this vector: "+vc.hashCode());
		System.out.println("Element at index 1 is: "+vc.get(1));

	}

}