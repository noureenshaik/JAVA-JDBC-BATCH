package LinkedListAddSetGetRemove;

import java.util.LinkedList;

public class LinkedList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> languages=new LinkedList<>();
		//add elements in the linked list
		languages.add("Pythan"); //index 0
		languages.add("Java");  // index 1
		languages.add("JavaScript");  // index 2
		languages.add("C++"); // index 3
		languages.add("Html"); // index 4
		languages.add("Css");  // index 5
		languages.add("Angular"); // index 6
		languages.add("React Js"); // index7
		
		System.out.println("LinkedList : "+ languages);
		
		//remove elements from index 1
		String str = languages.remove(1);
		String str1 = languages.remove(4);
		String str2 = languages.remove(2);
        String str3= languages.remove(3);
		
		System.out.println("Removed Element: " + str);
		System.out.println("Removed Element: " + str1);
		System.out.println("Removed Element: " + str2);
		System.out.println("Removed Element: " + str3);
		
		System.out.println("Updated LinkedList: "+ languages);
		
		
		

	}

}
