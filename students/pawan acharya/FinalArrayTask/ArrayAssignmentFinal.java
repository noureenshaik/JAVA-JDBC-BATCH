import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * @Author:Pawan Acharya
 */
public class ArrayAssignmentFinal {

	// Method to find the index of an element from an array
	static int findIndex(int arr[], int num) {

		if (arr == null)
			return -1;
		int len = arr.length;
		int i = 0;
		while (i < len) {
			if (arr[i] == num)
				return i;
			else
				i = i + 1;
		}
		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] testArray = { 3, 4, 6, 7, 9 };

		// System.out.println("Index position of 6 is: " + findIndex(testArray, 6));

		Scanner sc = new Scanner(System.in);

		int i, n, pos;

		System.out.println("Enter the number of elements:");
		n = sc.nextInt();
		int[] a = new int[n];

		System.out.println("Enter the elements");
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Enter the position of the number which is to be deleted");
		pos = sc.nextInt();

		for (i = pos; i < n - 1; i++) {
			a[i] = a[i + 1];
		}
		n = n - 1;

		System.out.println("\nOn deleting new array we get is\n");
		for (i = 0; i < n; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}

}
