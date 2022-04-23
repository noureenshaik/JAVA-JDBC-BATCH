package arrays;

public class AverageValueOfArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = new int[]{10, 18, 25, 32, -16, 60, -50};
	       //calculate sum of all array elements
	       int sum = 0;
	       for(int i=0; i < numbers.length ; i++)
	        sum = sum + numbers[i];
	       //calculate average value
	        double average = sum / numbers.length;
	        System.out.println("Average value of the array elements is : " + average); 
	   }
	}