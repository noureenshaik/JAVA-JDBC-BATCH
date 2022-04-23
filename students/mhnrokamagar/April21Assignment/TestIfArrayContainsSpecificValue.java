package arrays;

public class TestIfArrayContainsSpecificValue {

	public static boolean contains(int[] arr, int item) {
	      for (int n : arr) {
	         if (item == n) {
	            return true;
	         }
	      }
	      return false;
	   }
	   public static void main(String[] args) {
	          int[] my_array1 = {
	            1234, 1035, 1899, 1456, 2013, 
	            1458, 2458, 1254, 1472, 2365, 
	            1456, 2165, 1457, 2455};
	      System.out.println(contains(my_array1, 1456));
	      System.out.println(contains(my_array1, 2890));
	   }
	}
