import java.util.Arrays;

public class ArrayCopy {

	public static void main(String [] args) {
		
		int [] array= {1,2,3,4,5};
		int [] array2=new int[array.length];
		int [] array3=new int[5];
		System.arraycopy(array, 0, array2, 0, array.length);
		System.out.println("array 2 = "+Arrays.toString(array2));
		System.arraycopy(array, 2, array3, 1, 2);
		System.out.println("Array 3 = "+Arrays.toString(array3));
		
	}
}
