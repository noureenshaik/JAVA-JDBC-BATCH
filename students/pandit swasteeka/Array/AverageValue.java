package Array;
import java.util.Scanner;

public class AverageValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int arrsize = sc.nextInt(); // length of array.
		int ar[] = new int[arrsize];// creating the array

		System.out.println("Enter the number");
		for (int i = 0; i < arrsize; ++i) // Content inside the array
		{
			int value = sc.nextInt();
			ar[i] = value;
		}

		int sum = 0;
		for (int i = 0; i < arrsize; i++) // adding each element
		{
			sum += ar[i];
		}
		double average = sum / arrsize;

		System.out.println("Average of array : " + average);

	}

}
