package Hello;

import java.util.*;

public class Stackexample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating an object of Stack class
		Stack stk = new Stack();
		// pushing elements into stack
		stk.push("BMW");
		stk.push("Audi");
		stk.push("Ferrari");
		stk.push("Bugatti");
		stk.push("Jaguar");
		// iteration over the stack
		Iterator iterator = stk.iterator();
		while (iterator.hasNext()) {
			Object values = iterator.next();
			System.out.println(values);
		}
	}

}
