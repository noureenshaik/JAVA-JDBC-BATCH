package HashMap;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<Integer,String>tm=new TreeMap<Integer,String>();
tm.put(100, "Ode");
tm.put(50, "Eddie");
tm.put(32, "Marti");
tm.put(1, "Leno");

System.out.println(tm);

System.out.println(tm.firstKey());
System.out.println(tm.lastKey());

System.out.println(tm.tailMap(32));
System.out.println(tm.headMap(100));

System.out.println(tm.firstEntry());
System.out.println(tm.lastEntry());

System.out.println(tm.descendingMap());
	}

}
