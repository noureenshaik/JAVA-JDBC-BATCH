package arrays;

public class AssignmentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] numbers = {1, 2, 3, 4, 5, 6};
	        int [] positiveNumbers = numbers;    // copying arrays

	        for (int number: positiveNumbers) {
	            System.out.print(number + ", ");
	        }
	    }
	}
