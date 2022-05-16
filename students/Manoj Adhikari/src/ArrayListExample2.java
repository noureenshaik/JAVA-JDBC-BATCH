import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
      //  ArrayList<Integer> list = new ArrayList<Integer>();
       // ArrayList<Boolean> list = new ArrayList<Boolean>();
        list.add("Mango");
        list.add("Apple");
        list.add("Grapes");
        list.add("Banana");
//Traversing list via Iterator
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" , ");
        }
    }
}
