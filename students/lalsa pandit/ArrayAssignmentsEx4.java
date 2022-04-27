package arrays_assignment;

public class ArrayAssignmentsEx4 {

	public static boolean contains(int[] arr, int num) {
		for (int n: arr) {
			if (num == n) {
				return true;
			}
		}
		return false;
	

	}
	public static void main(String[] args) {
		int [] my_array1 = { 1234,4561,7895,1478,1239,1475,2547,1265};
		System.out.println(contains(my_array1,0000));
		System.out.println(contains(my_array1,7895));
		
	}

}
