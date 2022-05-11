package interview;

import java.util.Scanner;

public class SwapTwoNumberWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		System.out.println("Enter x and y");
		Scanner sc = new Scanner(System.in);

		x = sc.nextInt();
		y = sc.nextInt();

		System.out.println("Before Swapping\nx=" + x + "\ny=" + y);

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("After Swapping without third variable\nx=" + x + "\ny=" + y);

	}

}
