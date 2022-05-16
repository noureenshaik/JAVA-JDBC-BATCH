import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
      //  ArrayList<Integer> list = new ArrayList<Integer>();
       // ArrayList<Boolean> list = new ArrayList<Boolean>();

        list.add("Mango");
        list.add("Apple");
        list.add("Grapes");
        list.add("Banana");
        //Printing arraylist object
        System.out.println("Arraylist object: " +list);
//Traversing list via for-each loop
        for (String fruit : list) {
            System.out.print(fruit+" , ");
        }

    }
}
