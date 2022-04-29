package com.StringBuffer;

public class replaceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String np = "I am from USA";
		StringBuffer tx = new StringBuffer(np);
		
		tx.replace(10,13,"Nepal");
		
		System.out.println("Before replace: :" +np);
		System.out.println("After replace: "+tx);

	}

}
