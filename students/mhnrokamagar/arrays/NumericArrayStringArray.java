package arrays;
import java.util.Arrays;


public class NumericArrayStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] my_array1 = {
				1230, 1240, 1350, 1456, 2015, 2017, 2018, 1321, 2434, 2489};
		
		String[] my_array2 = { 
				"Hello", "Hi", "how You doing", "k chha", "kata ho ?", "Java"
		};
		
		System.out.println("Original numeric array :" +Arrays.toString(my_array1));
		Arrays.sort(my_array1);
		System.out.println("Sorted numeric array :" +Arrays.toString(my_array1));
		
		System.out.println("Original string array : "+Arrays.toString(my_array2));
	    Arrays.sort(my_array2);
	    System.out.println("Sorted string array : "+Arrays.toString(my_array2));

	}

}
