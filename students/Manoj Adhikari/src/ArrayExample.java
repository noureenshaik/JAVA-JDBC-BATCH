import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ArrayExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
      //  ArrayList<Integer> list = new ArrayList<Integer>();
       // ArrayList<Boolean> list = new ArrayList<Boolean>();

        list.add("Mango");
        list.add("Apple");
        list.add("Grapes");
        list.add("Banana");

        System.out.println("transversing list via list iterator");
        ListIterator<String>list1=list.listIterator(list.size());
        while(list1.hasPrevious()){
            String str = list1.previous();
            System.out.println(str);
        }
        System.out.println("transversing list via for loop");

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("transversing list via for each() method");
        //forEach() method is a new feature, introduced java 8,using lamda expression
        list.forEach(a->{
            System.out.println(a);
        });
        


    }
}
