package arrays;

import java.util.Arrays;

public class ArraysMore {
	public static void main(String args[]) {
		int[] arr = {2,3,45,4,5,78,0};
		System.out.println(Arrays.toString(arr));
		System.out.println("Index of 45 is " + findIndex(arr, 45) + " and that of 6 is " + findIndex(arr, 6));
		
		System.out.println("Removing element from arr at index 4 ");
		removeElement(arr, 4);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Copying the above array to new array ");
		int[] dest = new int[arr.length];
		copyArray(arr, dest);
		System.out.println(Arrays.toString(dest));
		
		System.out.println("Inserting 100 at index 1 in the above array");
		insertAtIndex(arr, 1, 100);
		System.out.println(Arrays.toString(arr));
		
		int[] minNMax = new int[2];
		minNMax = minMax(arr);
		System.out.println("The smallest = " + minNMax[0] + " and the largest = " + minNMax[1]);
		
		System.out.println("Reversed array for the above array");
		reverseArray(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	public static int findIndex(int[] arr, int target) {
		if(arr == null) return -1;
		
		for(int i = 0; i < arr.length;i++) {
			if(arr[i] == target) return i; 
		}
		return -1;
	}
	
	//shifting all the elements after index. the last two elements are same since array has static size
	public static void removeElement(int[] arr, int index) {
		for(int i = index; i < arr.length -1; i++) arr[i] = arr[i+1];
	}
	
	public static void copyArray(int[] src, int[] dest) {
		int i = 0, j = 0;
		while(i < src.length) {
			dest[j++] = src[i++];
		}
	}
	
	public static void insertAtIndex(int[] arr, int index, int num) {
		for(int i = arr.length-1; i> index; i--) {
			arr[i] = arr[i -1];
		}
		arr[index] = num;
	}
	
	public static int[] minMax(int[] arr) {
		//int[] res = new int[2];
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for(int a: arr) {
			if(min > a) min = a;
			if(max < a) max = a;
		}
		return new int[]{min, max};
	}
	
	public static void reverseArray(int[] arr) {
		int l = 0, r = arr.length -1;
		while(l < r) {
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l++;
			r--;
		}
	}
	

}
