package hasMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HasmapDemo {
	public static void main(String[] args) {
		// generic method
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(100, "Manoj");
		hm.put(200, "Deepa");
		hm.put(300, "Shiva");
		System.out.println(hm);

		String name = hm.get(100);
		System.out.println(name);

		// to fetch a keys
		Set<Integer> keySet = hm.keySet();// return the keys
		// for loop
		// for each
		// iterator ==? iterable
		// listeIterator - List
		Iterator<Integer> it = keySet.iterator();
		while (it.hasNext()) {
			Integer no = it.next();
			System.out.println(no + " ");
		}
		System.out.println();
//to fetch the value
		Collection<String> names = hm.values();
		// for loop
		// for each
		// iterator = Iterable

		for (String str : names) {
			System.out.println(str);
		}
		
		// fetch key and value
		Set<Entry<Integer, String>> entrySet = hm.entrySet();
		
		for(Map.Entry<Integer, String> en: hm.entrySet())
		{
			System.out.println(en.getKey()+"\t"+en.getValue());
		}
	}

}
