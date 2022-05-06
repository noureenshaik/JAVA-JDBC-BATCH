package com.wrapperclass;

public class WrapperExample1 {

	public static void main(String[] args) {
		int a = 30;
		Integer i = Integer.valueOf(a); //converting int into Integer explicitly
		Integer j = a; //autoboxing, now compiler will write Integer.valueOf(a) internally
		System.out.println(a+" "+i+" "+j);

	}

}
