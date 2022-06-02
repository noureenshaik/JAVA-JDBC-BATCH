package Stack;

import java.util.Stack;

public class Stackdemo {
    public static void main(String[] args) {
        //creating instance of stack class
        Stack<Integer> stk = new Stack<Integer>();
        //checking stack is empty or not
        boolean result = stk.empty();
        System.out.println("Is the stack empty: "+ result);
        //pushing elements int o stack
        stk.push(78);
        stk.push(113);
        stk.push(90);
        stk.push(120);
        //prints elements of the stack
        System.out.println("Elements in stack "+ stk);
        result=stk.empty();
        System.out.println("Is the stack empty: "+ result);

        //Stack is empty -1
        //stack with 1 element is 0
        //n-1 stack is full
        //n stack is overdue




    }
}
