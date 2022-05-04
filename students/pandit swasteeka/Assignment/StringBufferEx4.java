package com.stringbuffer;

public class StringBufferEx4 {

	public static void main(String[] args) {
		String str1 = new String("Swastika");
		String str2 = "swastika";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		System.out.println(java.time.LocalDateTime.now());
		
		byte[] bArray = str1.getBytes();
		for(int i=0; i<bArray.length; i++) {
			System.out.print(bArray[i]);
		}
		
	}

}
