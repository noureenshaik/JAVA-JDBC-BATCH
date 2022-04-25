package arrays;
import java.util.*;

public class MultidimensionalArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many rows and columns?");
		int row = in.nextInt();
		int col = in.nextInt();
		int[][] array = new int[row][col];
		System.out.println("Input array elements");
		input(array, row, col, in);
		
		System.out.println("Array before sorting");
		displayArray(array);
		// sort each row in the 2D array
		for(int[] r: array) {
			Arrays.sort(r);
		}
		System.out.println("Array after sorting");
		displayArray(array);
		
		
	}
	
	public static void input(int[][] array, int row, int col, Scanner in) {
		for(int i = 0; i< row; i++) {
			for(int j = 0; j < col; j++) {
				array[i][j] = in.nextInt();
			}
		}
	}
	
	public static void displayArray(int[][] array) {
		for(int i = 0; i< array.length; i++) {
			for(int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
}
