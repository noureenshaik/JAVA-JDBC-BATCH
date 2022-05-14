package ListExamples;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class QueueDequeEx {
    public static void main(String[] args) {

        Queue<String> languageEx = new LinkedList<String>();

        System.out.println("Queue example");
        languageEx.add("python");
        languageEx.add("java");
        languageEx.add("C");
        System.out.println(languageEx);

        String first = languageEx.peek();
        System.out.println("The frist element is " + first);

        String str2 = languageEx.poll();
        System.out.println("The remove element is " + str2);

        languageEx.offer("C++");
        System.out.println("The new values are " + languageEx);
        System.out.println("----------------------------------");

        Deque<String> animals = new LinkedList<>();

        System.out.println("Deque example");
        animals.add("Cow");
        System.out.println("List is" + animals);
        animals.addFirst("Dogo");
        System.out.println("List after adding first" + animals);
        animals.removeFirst();
        System.out.println("List after removing first" + animals);
        animals.addLast("Kitty");
        animals.add("dog");
        System.out.println("List after adding last" + animals);
        animals.removeLast();
        System.out.println("List after remove last" + animals);
        animals.remove();
        System.out.println("List after remove " + animals);
        System.out.println("----------------------------------");

        System.out.println("Testing the vector exmple");
        Vector<String> v = new Vector<String>(4);
        v.add("File");
        v.add("View");
        v.addElement("Terminla");
        v.addElement("Help");

        System.out.println("The vector is " + v);
        System.out.println("The vector capcipy are " + v.capacity() + " and size " + v.size());
        v.addElement("Select");
        System.out.println("The vector capcipy are " + v.capacity() + " and size " + v.size());

        Vector<Integer> num = new Vector<>();
        num.add(45);
        num.add(23);
        num.add(54);
        num.add(15);
        num.add(69);
        num.add(54);
        num.add(20);
        System.out.println("----------------------------------");

        System.out.println("The vector elements are " + num);
        System.out.println("Remove the first occurace of element 54 " + num.remove((Integer)54));
        System.out.println("The vector elements are " + num);
        System.out.println("Remove the element are 4th index " + num.remove(4));
        System.out.println("The vector elements are " + num);
        
        System.out.println("The hashcode of the vectore is " + num.hashCode());
        System.out.println("Element are index 1 is " + num.get(1));
    }
}