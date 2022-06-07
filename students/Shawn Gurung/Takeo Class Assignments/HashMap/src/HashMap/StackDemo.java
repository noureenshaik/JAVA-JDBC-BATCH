package HashMap;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>stk=new Stack<>();
		System.out.println(stk.empty());
		stk.push(40);
		stk.push(10);
		stk.push(07);
		stk.push(23);
		stk.push(6);
		
		System.out.println("Elements in Stack : " +stk);
		System.out.println(stk.empty());
		System.out.println(stk.pop());
		System.out.println(stk);
		
		int location=stk.search(23);
		System.out.println(location);
		
		System.out.println(stk.size());
		for(int i=0;i<stk.size();++i)
		{
			System.out.println(stk.get(i));
		}

	}

}
