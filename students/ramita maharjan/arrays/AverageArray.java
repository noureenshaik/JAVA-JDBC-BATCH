package arrays;
import java.util.Scanner;

public class AverageArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("No of elements in array: ");
		int len = in.nextInt();	
		int[] arr = new int[len];
		// using sum and input methods from ArraySum class
		ArraySum obj = new ArraySum();
		obj.input(arr);
		
		System.out.println(obj.sumArray(arr)/(float)len);
	}
}
