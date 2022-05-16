import java.util.ArrayList;
import java.util.List;

public class ArraySetExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
      //  ArrayList<Integer> list = new ArrayList<Integer>();
       // ArrayList<Boolean> list = new ArrayList<Boolean>();

        list.add("Mango");
        list.add("Apple");
        list.add("Grapes");
        list.add("Banana");
        //accessing element
        System.out.println("Returning element: " +list.get(1)+"\t" +list.get(2) );
        list.set(1,"KIWI");
        list.set(2,"AVOCADO");
//Traversing list via for-each loop
        for (String fruit : list) {
            System.out.print(fruit+" , ");
        }

    }
}
