package ListExamples;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<String>();

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");

        System.out.println("Linked List " + animals);

        animals.add(1, "Horse");
        animals.add(4, "Chicken");
        System.out.println("Updated Linked List " + animals);

        String str = animals.get(1);
        System.out.println("Element at Index 1 is" + str);
    }
}
