package com.stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack <Integer> stk =new Stack <>();
		System.out.println("Stack: "+stk);
		pushelmnt(stk, 20);
		pushelmnt(stk, 13);
		pushelmnt(stk, 89);
		pushelmnt(stk, 90);
		pushelmnt(stk, 11);
		pushelmnt(stk, 45);
		pushelmnt(stk, 18);
		//popping elements from the stack
		popelmnt(stk);
		popelmnt(stk);
		
		boolean rslt = stk.empty();
		System.out.println("Is the stack empty or not?"+rslt);
		int x = stk.size(); 
		System.out.println("Size of stack is:" +x);
		System.out.println("********************");
		try {
			popelmnt(stk);
		}
		catch (EmptyStackException e){
			System.out.println("Empty Stack");
			}
	}
	

	private static void popelmnt(Stack<Integer> stk) {
		// TODO Auto-generated method stub
		System.out.println("pop ->");
		//invoking pop method
		Integer x = (Integer) stk.pop();
		System.out.println(x);
		System.out.println("stack: "+stk);
	}

	private static void pushelmnt(Stack<Integer> stk, int x) {
		// TODO Auto-generated method stub
		stk.push(new Integer(x));
		System.out.println("push ->"+x);
		System.out.println("push ->"+stk);
	}
	

}