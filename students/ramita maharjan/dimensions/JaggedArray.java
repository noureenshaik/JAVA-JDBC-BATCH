package dimensions;

import java.util.*;

public class JaggedArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int rows, valCount;
		rows = sc.nextInt();
		
		int[][] array = new int[rows][];
		for (int i = 0; i < array.length; i++) {
	        valCount = sc.nextInt();
	        array[i] = new int[valCount];
	        for (int j = 0; j < array[i].length; j++) {
	            array[i][j] = sc.nextInt();
	        }
	    } 
		for (int i = 0; i < array.length; i++) {
			  
	        // Initialize total number of
	        // even & odd numbers to zero
	        int nEvenNumbers = 0, nOddNumbers = 0;
	
	        // prints TestCase number with
	        // total number of its arguments
	        System.out.println(
	            "TestCase " + i + " with "
	            + array[i].length + " values:");
	        for (int j = 0; j < array[i].length; j++) {
	            System.out.print(array[i][j] + " ");
	
	            // even & odd counter updated as
	            // eligible number is found
	            if (array[i][j] % 2 == 0) {
	                nEvenNumbers++;
	            }
	            else {
	                nOddNumbers++;
	            }
	        }
	        System.out.println();
	
	        // Prints total numbers of
	        // even & odd
	        System.out.println(
	            "Total Even numbers: " + nEvenNumbers
	            + ", Total Odd numbers: " + nOddNumbers);
	    }
	}
	
}
