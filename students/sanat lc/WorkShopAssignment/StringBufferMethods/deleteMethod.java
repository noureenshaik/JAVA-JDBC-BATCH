package com.StringBuffer;

public class deleteMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String np="I Love USA";
		
		StringBuffer tx= new StringBuffer(np);
		tx.delete(8,11);
		
		System.out.println("Before Delete: "+np);
		System.out.println("After Delete: "+tx);
	}

}
