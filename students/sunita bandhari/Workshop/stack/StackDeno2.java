package com.stack;

import java.util.Iterator;
import java.util.Stack;

public class StackDeno2 {

	public static void main(String[] args) {
		Stack stk = new Stack();
		stk.push("BMW");
		stk.push("Audi");
		stk.push("Ferrari");
		stk.push("Bugatti");
		stk.push("Jaguar");
		//Iteration over the stack
		Iterator itr = stk.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
