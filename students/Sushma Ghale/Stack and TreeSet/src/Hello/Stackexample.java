package Hello;

import java.util.Stack;//IMPORT JAVA.UTIL.*;

public class Stackexample {

	public static void main(String[] args) {

		// creating an instance of Stack class
		Stack<Integer> stk = new Stack<>();

		// checking stack is empty or not
		boolean result = stk.empty();
		System.out.println("Is the stack empty?" + result);
		// pushing elements into stack
		stk.push(78);
		stk.push(113);
		stk.push(90);
		stk.push(120);
		// prints elements of the stack
		System.out.println("Elements in Stack: " + stk);
		result = stk.empty();
		System.out.println("Is the stack empty? " + result);
	}
}
//STACK IS EMPTY -1
//STACK WITH 1 ELEMENT IS 0
//N-1 STACK IS FULL
//N STACK IS OVERDUE