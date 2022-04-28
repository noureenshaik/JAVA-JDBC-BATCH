package arrays_assignment;

public class ArrayAssignmentEx1 {

	public static void main(String[] args) {
		
		int[] numbers = new int[] {10,20,30,40,50,60};
		//Sum of all the array elements 
		
		int sum = 0;
		for (int i=0; i< numbers.length;i++)
			sum = sum +numbers[i];
		System.out.println("Sum of an arrary : " + sum);
		
		// for average value
		double average = sum /2;
		System.out.println("AVerage value of an arrary : " + average);

	}

}
