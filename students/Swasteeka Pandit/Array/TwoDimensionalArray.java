package Homework1;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 3, 4 } };
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
