import java.util.*;

public class ArrayDimension {
public static void main(String[] args) {
		
		int[] anArray;
		anArray = new int[3];
		anArray[0] = 8;
		anArray[1] = 4;
		anArray[2] = 89;
		System.out.println("The array elements are :");
		System.out.println("Element at index 0: " + anArray[0]);
		System.out.println("Element at index 1: " + anArray[1]);
		System.out.println("Element at index 2: " + anArray[2]);

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of Array: ");
		int arr = scan.nextInt();
		int[] array = new int[arr];
		System.out.println("Enter the elements of the array");
		for (int i = 0; i < arr; i++) {
			array[i] = scan.nextInt();
		}
		System.out.println("Displaying array elements:");
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println("");

		int[][] twoArray = { { 1, 2 }, { 3, 4 } };
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(twoArray[i][j] + " ");
			}
			System.out.println();
	}
	}
}
