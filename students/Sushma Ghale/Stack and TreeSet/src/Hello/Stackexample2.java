package Hello;

import java.util.Stack;

public class Stackexample2 {
	public static void main(String[] args) {
		Stack stk = new Stack();
		stk.push(22);
		stk.push(33);
		stk.push(44);
		stk.push(55);
		stk.push(66);
		// Checks the Stack is empty or not
		boolean rslt = stk.empty();
		System.out.println("Is the stack empty or not?" + rslt);
		// Find the size of the Stack
		int x = stk.size();
		System.out.println("The stack size is:" + x);
	}
}
