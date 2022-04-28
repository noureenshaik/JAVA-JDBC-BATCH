package Loops;

import java.util.Arrays;

public class CopyArrayUsingLoop {
	public static void main(String[] args) {
	       
        int [] src = {31, 42, 3, 24, 5, 96};
        int[] dest = new int[src.length];

        for (int i = 0; i < src.length; i++) {
            dest[i] = src[i];
        }
        
        System.out.println("Copied array " + Arrays.toString(dest));
    }
}
