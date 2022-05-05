package Array;

import java.util.Arrays;

public class ArraysToStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n1 = {21, 23, 2, 4, 32, 2};
		int[] n2 = new int[5];
        int[] n3 = new int[n1.length];
      
      
        System.arraycopy(n1, 0, n3, 0, n1.length);

        System.out.println("n3 = " + Arrays.toString(n3)); 
        
        // copying elements from index 2 on n1 array
        // copying element to index 1 of n3 array
        // 2 elements will be copied
        System.arraycopy(n1, 2, n2, 1, 2);
        System.out.println("n3 = " + Arrays.toString(n2));  

	}

}
