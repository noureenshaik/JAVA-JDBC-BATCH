package Array;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] source = {1, 2, 3, 4, 5, 6};
		int [] destination = new int[6];
		for(int i=0; i<source.length; i++) {
			destination[i] = source[i];
		}
		System.out.println(Arrays.toString(destination));
	}
	}


