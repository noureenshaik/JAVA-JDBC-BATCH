package arrays;

import java.util.Scanner;

public class ArraySum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("No of elements in array: ");
		int len = in.nextInt();	
		int[] arr = new int[len];
		
		ArraySum obj = new ArraySum();
		obj.input(arr);
		System.out.println(obj.sumArray(arr));
		
	}
	public void input(int[] arr) {
		System.out.println("Enter elements in array: ");
		// input array elements
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++) arr[i] = in.nextInt();
	}
	
	public int sumArray(int[] arr) {
		int sum = 0;
		for(int a: arr) {
			sum += a;
		}
		return sum;
	}
}
