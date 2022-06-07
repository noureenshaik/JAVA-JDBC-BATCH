package HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> hm=new HashMap<>();
hm.put(100, "Saka");
hm.put(200, "Xhaka");
hm.put(300, "Laca");

System.out.println(hm);
	
String name=hm.get(100);
System.out.println(name);
//to fetch a key
Set<Integer> keySet = hm.keySet();
//for loop
//for each
//iterator -->Iterable
//ListIterator -->List
Iterator<Integer> it =keySet.iterator();
while(it.hasNext())
{
	Integer no= it.next();
	System.out.print(no+" ");
}
System.out.println();

Collection<String> names = hm.values();

for(String str : names)
{
	System.out.println(str);
}

Set<Entry<Integer,String>> entrySet = hm.entrySet();

for(Map.Entry<Integer,String> en : hm.entrySet()) {
	System.out.println(en.getKey()+"\t"+en.getValue());
}
	
}
}
