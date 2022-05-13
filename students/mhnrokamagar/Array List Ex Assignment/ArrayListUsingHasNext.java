package usedinterfacejava;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListUsingHasNext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				ArrayList<String> list=new ArrayList<String>();// creating arraylist
				///Adding object in arraylist
				list.add("Orange");
				list.add("Kiwi");
				list.add("Cherry");
				list.add("Grapes");
				//traversing list through Iterator
				Iterator itr=list.iterator();
				while(itr.hasNext()) {
					
				System.out.println(itr.next());

			}

		}


	}


