import java.util.Arrays;

public class InsertElementArray {

	public static void main(String[] args) {
	
		int [] array= {12,13,14,15,16,17};
		int pos=2;
		int newValue=100;
		System.out.println("Original Array Values : "+Arrays.toString(array));
		
		for(int i=array.length-1;i>pos;i--) {
			array[i]=array[i-1];
		}
		array[pos]=100;
		System.out.println("The New Values : "+Arrays.toString(array));
		
	}

}
