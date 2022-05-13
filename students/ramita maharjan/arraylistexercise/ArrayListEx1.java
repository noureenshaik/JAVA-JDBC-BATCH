package arraylistexercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListEx1 {
	public static void main(String args[]){  
	    ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
	           list.add("Ravi");//Adding object in arraylist  
	           list.add("Vijay");  
	           list.add("Ravi");  
	           list.add("Ajay");  
	            
	           System.out.println("Traversing list through List Iterator:");  
	           //Here, element iterates in reverse order  
	              ListIterator<String> list1=list.listIterator(list.size());  
	              while(list1.hasPrevious())  
	              {  
	                  String str=list1.previous();  
	                  System.out.println(str);  
	              }  
	        System.out.println("Traversing list through for loop:");  
	           for(int i=0;i<list.size();i++)     
	           {  
	            System.out.println(list.get(i));     
	           }  
	              
	        System.out.println("Traversing list through forEach() method:");  
	        //The forEach() method is a new feature, introduced in Java 8.  
	            list.forEach(a->{ //Here, we are using lambda expression  
	                System.out.println(a);  
	              });  
	                
	            System.out.println("Traversing list through forEachRemaining() method:");  
	              Iterator<String> itr=list.iterator();  
	              itr.forEachRemaining(a-> //Here, we are using lambda expression  
	              {  
	            System.out.println(a);  
	              });  
	}
}
