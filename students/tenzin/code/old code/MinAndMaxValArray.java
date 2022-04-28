import java.util.Arrays;

public class MinAndMaxValArray {
	static int max;
	static int min;
	public static void MaxMin(int array[]){
		max=array[0];
		min=array[0];
		int length =array.length;
		
		for(int i=1;i<length-1;i=i+2) {
			if(i+1>length) {
				if(array[i]>max) {
					max=array[i];
				}
				if(array[i]<min) {
					min=array[i];
				}
			}
			if(array[i]>array[i+1]) {
				if(array[i]>max) {
					max=array[i];
				}
				if(array[i+1]<min) {
					min=array[i+1];
				}
			}
			if(array[i]<array[i+1]) {
				if(array[i]<min) {
					min=array[i];
				}
				if(array[i+1]>max) {
					max=array[i+1];
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] array= {23,14,32,45,31,2,87,66};
		MaxMin(array);
		System.out.println("Original array "+ Arrays.toString(array));
		System.out.println("Maximum Value of array is "+max);
		System.out.println("Minimun Value of array is "+min);
		
	}

}
