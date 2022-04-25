package arrays;

import java.util.Scanner;

public class CheckForNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("No of elements in array: ");
		int len = in.nextInt();	
		int[] arr = new int[len];
		
		ArraySum obj = new ArraySum();
		obj.input(arr);
		
		System.out.println("Element to search in array: ");
		int target = in.nextInt();	
		System.out.println(contains(arr, target));
	}
	
	public static boolean contains(int[] arr, int num) {
		for(int a: arr) {
			if(a == num) return true;
		}
		return false;
	}
}
