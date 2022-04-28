import java.util.Arrays;

public class RemoveIndex {

	public static void main(String[] args) {
		int [] array= {1,22,33,44,55,66,77,88};
		int removalIndex=2;
		for(int i=removalIndex;i<array.length-1;i++) {
			array[i]=array[i+1];
		}
		System.out.println("The array after Removal is "+Arrays.toString(array));
	}
			}


