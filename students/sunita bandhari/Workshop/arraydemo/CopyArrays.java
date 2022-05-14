package com.arraydemo;

import java.util.Arrays;

public class CopyArrays {

	public static void main(String[] args) {
		int [] source = {1, 2, 3, 4, 5, 6};
		int [] destination = new int[6];
		for(int i=0; i<source.length; i++) {
			destination[i] = source[i];
		}
		System.out.println(Arrays.toString(destination));
	}

}
