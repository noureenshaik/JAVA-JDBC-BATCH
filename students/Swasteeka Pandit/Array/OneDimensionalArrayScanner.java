package Homework1;

import java.util.Scanner;

public class OneDimensionalArrayScanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of Array: ");
		int arrLength = scan.nextInt();
		int[] anArray = new int[arrLength];
		System.out.println("Enter the elements of the Array");
		for (int i = 0; i < arrLength; i++) {
			anArray[i] = scan.nextInt();
		}
		// Printing the One Dimensional Array
		System.out.println("Displaying One dimensional array elements:");
		for (int i = 0; i < arrLength; i++) {
			System.out.print(anArray[i] + " ");
		}

	}

}
