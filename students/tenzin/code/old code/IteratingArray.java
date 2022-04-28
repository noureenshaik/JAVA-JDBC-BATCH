import java.util.Arrays;

public class IteratingArray {
	
	public static void main(String [] args) {
		int [] array={1,2,3,4,5,6};
		int [] newArray=new int[10];
		
		for (int i=0;i<array.length;i++) {
			newArray[i]=array[i];
		}
		System.out.println("Old Array = "+Arrays.toString(array)+"\nNew Array = "+Arrays.toString(newArray));
		
	}
}
