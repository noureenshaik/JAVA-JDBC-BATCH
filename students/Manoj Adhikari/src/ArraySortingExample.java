import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraySortingExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
      //  ArrayList<Integer> list = new ArrayList<Integer>();
       // ArrayList<Boolean> list = new ArrayList<Boolean>();

        list.add("Mango");
        list.add("Apple");
        list.add("Grapes");
        list.add("Banana");
        // sort
        Collections.sort(list);
        System.out.println(list);
        for(String fruit:list){
            System.out.println(fruit);
        }
        //List<String> list1 = new ArrayList<String>();
          ArrayList<Integer> list1 = new ArrayList<Integer>();
        // ArrayList<Boolean> list = new ArrayList<Boolean>();

        list1.add(100);
        list1.add(34);
        list1.add(300);
        list1.add(455);
        // sort
        Collections.sort(list1);
        System.out.println(list1);
        for(Integer fruit:list1){
            System.out.println(fruit);
        }


    }
}
