package arrays;
import java.util.*;

public class SortArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("No of elements in array: ");
		int len = in.nextInt();	
		int[] arr = new int[len];
		// input array elements
		for(int i = 0; i < len; i++) arr[i] = in.nextInt();
		numSort(arr);
		System.out.println("Sorted numeric array:" + Arrays.toString(arr));

		
		String[] strArr = {"sort", "an", "string", "array", "arr", "in"};
		System.out.println("String array:" + Arrays.toString(strArr));

		strSort(strArr);
		System.out.println("Sorted string array:"+ Arrays.toString(strArr));

	}
	
	public static void numSort(int[] arr) {
		int len = arr.length;
		for(int i = 0; i < len -1; i++) {
			for(int j = i+1; j < len; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void strSort(String[] arr) {
		int len = arr.length;
		for(int i = 0; i < len -1; i++) {
			for(int j = i+1; j < len; j++) {
				if(arr[i].compareTo(arr[j]) > 0) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

}
