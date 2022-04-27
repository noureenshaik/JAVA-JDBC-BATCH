package dimensionalarray;

public class OneDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declares an one Dimensional Array of integers
		int [] anArray;
		
		//Allocates memory for 3 integers
		anArray = new int[3];
		
		//initializes first element
		anArray[0] = 8;
		//initializes second element
		anArray[1] = 4;
		//initialize third element
		anArray[2] = 89;
		
		//printing the one Dimensional Array
		System.out.println("One dimensional array elements are :");
		System.out.println("Element at index 0: "+ anArray[0]);
		System.out.println("Element at index 1: "+ anArray[1]);
		System.out.println("Element at index 2: "+ anArray[2]);
		

	}

}
