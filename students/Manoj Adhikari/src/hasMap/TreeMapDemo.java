package hasMap;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(100, "Manoj");
		tm.put(10, "sita");
		tm.put(1, "ram");
		tm.put(200, "hari");
		System.out.println(tm);

		System.out.println(tm.firstKey());
		System.out.println(tm.lastKey());

		System.out.println(tm.firstEntry());
		System.out.println(tm.lastEntry());

		System.out.println(tm.descendingMap());
		System.out.println(tm.tailMap(100));
		System.out.println(tm.headMap(100));


	}

}
