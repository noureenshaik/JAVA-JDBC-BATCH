package ListExamples;

import java.util.LinkedList;

public class LinkedListEx2 {
    public static void main(String[] args) {
        LinkedList<String> language = new LinkedList<>();

        language.add("Java");
        language.add("Python");
        language.add("JavaScript");
        language.add("C++");
        language.add("HTML");
        language.add("CSS");
        language.add("SQL");
        System.out.println("LinkedList "+language);

        System.out.println(" ");
        language.set(3, "Kotlin");
        System.out.println("Updated LinkedList "+language);
        System.out.println(" ");

        String str = language.get(4);
        String str2 = language.get(5);
        String str3 = language.get(3);
        String str4 = language.get(1);
        language.remove(4);
        language.remove(5);
        language.remove(3);
        language.remove(1);
        System.out.println("LinkedList After remove "+language);
        System.out.println(" ");
        System.out.println("removed language "+str+" " +str2+" " +str3+" "+str4);

        String str5 = language.peek();
        System.out.println("Linked List "+ str5);

        String str6 = language.poll();
        System.out.println("Linked List "+ str6);
    }
}
