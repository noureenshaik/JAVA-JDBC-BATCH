package com.stringbuffer;

public class StringBufferEx3 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("Hello");
		System.out.println(sb.capacity());
		sb.append("Java is my favorite language");
		System.out.println(sb.capacity());
		sb.ensureCapacity(10);//now no change
		System.out.println(sb.capacity());//now 34  
		sb.ensureCapacity(50);//now (34*2)+2  
		System.out.println(sb.capacity());//now 70  

	}

}
