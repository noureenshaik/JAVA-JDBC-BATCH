package com.StringBuffer;

public class capacityMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("Hello");
		System.out.println(sb.capacity());
		sb.append("Jave is going to be amazing journey");
		System.out.println(sb.capacity());
	}

}
