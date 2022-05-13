package ListExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class FirstList {
    public static void main(String[] args) {
        ArrayList<String> li = new ArrayList<String>();
        li.add("project");
        li.add("code");
        li.add("message");
        li.add("example");
        li.add("coins");

        System.out.println("Using For loop");
        for (String l : li)
            System.out.println(l);

        System.out.println("");
        System.out.println("Using iterator");
        Iterator<String> itr = li.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("");
        System.out.println("Testing set and get");
        System.out.println("Returning the first element " + li.get(1));
        System.out.println("Returning the second element " + li.get(2));
        System.out.println("Returning the fourth element " + li.get(4));

        li.set(3, "strom");
        li.set(4, "ocean");
        li.set(2, "strength");
        System.out.println(li);

        System.out.println("");
        System.out.println("Testing sort");
        Collections.sort(li);
        System.out.println(li);
    }
}
