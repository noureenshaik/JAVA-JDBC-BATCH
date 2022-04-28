package arrays_assignment;

import java.util.Arrays;
public class ArrayAssignmentEx2 {

	public static void main(String[] args) {
	
		int[] my_array1 = {2022,2010,3021,5246,1478,1236,4569,1428 };
		String[] my_array2 = {"Sami", "Java","PHP","Lion","python"};
		
		System.out.println("Numeric Value : " + Arrays.toString(my_array1));
		Arrays.sort(my_array1);
		System.out.println("Sorted numeric Value : " + Arrays.toString(my_array1));

		System.out.println("Numeric Value : " + Arrays.toString(my_array2));
		Arrays.sort(my_array2);
		System.out.println("Sorted Numeric Value : " + Arrays.toString(my_array2));
	}

}
