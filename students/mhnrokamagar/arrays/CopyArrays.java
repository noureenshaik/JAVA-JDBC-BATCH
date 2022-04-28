package arrays;

import java.util.Arrays;



public class CopyArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] source = {1, 2, 3, 4, 5, 6};
	        int [] destination = new int[6];

	        // iterate and copy elements from source to destination
	        for (int i = 0; i < source.length; ++i) {
	            destination[i] = source[i];
	        }
	      
	         // converting array to string
	        System.out.println(Arrays.toString(destination));
	    }
	}
