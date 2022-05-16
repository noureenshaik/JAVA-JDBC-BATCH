package Hello;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
	
	  public static void main(String args[]) {
	    ArrayList<String> list = new ArrayList<String>();
	    list.add("Orange");
	    list.add("Kiwi");
	    list.add("Banana");
	    list.add("Cherry");
	    Iterator itr=list.iterator();
	    while(itr.hasNext()) {
	      System.out.println(itr.next());
	    }
}
}
